package edu.java.training.chapter15.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import edu.java.training.chapter15.entity.Device;
import edu.java.training.chapter15.handler.DeviceXmlTag;

public class DeviceStaxBuilder {
	private Set<Device> devices;
	private XMLInputFactory inputFactory;

	public DeviceStaxBuilder() {
		inputFactory = XMLInputFactory.newInstance();
		devices = new HashSet<Device>();
	}

	public Set<Device> getDevices() {
		return devices;
	}

	public void buildSetDevices(String filename) {
		XMLStreamReader reader;
		String name;
		try (FileInputStream inputStream = new FileInputStream(new File(filename))) {
			reader = inputFactory.createXMLStreamReader(inputStream);
			// StAX parsing
			while (reader.hasNext()) {
				int tagType = reader.next();
				if (tagType == XMLStreamConstants.START_ELEMENT) {
					name = reader.getLocalName();
					if (name.equals(DeviceXmlTag.DEVICE.getValue())) {
						Device device = buildDevice(reader);
						devices.add(device);
					}
				}
			}
		} catch (XMLStreamException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Device buildDevice(XMLStreamReader reader) throws XMLStreamException {
		Device device = new Device();
		device.setName(reader.getAttributeValue(null, DeviceXmlTag.NAME.getValue()));
		// null check
		device.setOrigin(reader.getAttributeValue(null, DeviceXmlTag.ORIGIN.getValue()));
		String name;
		while (reader.hasNext()) {
			int type = reader.next();
			switch (type) {
			case XMLStreamConstants.START_ELEMENT:
				name = reader.getLocalName();
				switch (DeviceXmlTag.valueOf(name.toUpperCase())) {
				case PRICE -> device.setPrice(Integer.parseInt(getXMLText(reader)));
				case CRITICAL -> device.setCritical(Boolean.parseBoolean(getXMLText(reader)));
				case TYPE -> device.setType(getXMLType(reader));
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				name = reader.getLocalName();
				if (DeviceXmlTag.valueOf(name.toUpperCase()) == DeviceXmlTag.DEVICE) {
					return device;
				}
			}
		}
		throw new XMLStreamException("Unknown element in tag <student>");
	}

	private Device.Type getXMLType(XMLStreamReader reader) throws XMLStreamException {
		Device.Type type = new Device().new Type();
		int tagType;
		String name;
		while (reader.hasNext()) {
			tagType = reader.next();
			switch (tagType) {
			case XMLStreamConstants.START_ELEMENT:
				name = reader.getLocalName();
				switch (DeviceXmlTag.valueOf(name.toUpperCase())) {
				case GROUP -> type.setGroup(getXMLText(reader));
				case POWERCONSUMPTION -> type.setPowerConsumption(Integer.parseInt(getXMLText(reader)));
				case COOLER -> type.setCooler(Boolean.parseBoolean(getXMLText(reader)));
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				name = reader.getLocalName();
				if (DeviceXmlTag.valueOf(name.toUpperCase()) == DeviceXmlTag.TYPE) {
					return type;
				}
			}
		}
		throw new XMLStreamException("Unknown element in tag <address>");
	}

	private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
		String text = null;
		if (reader.hasNext()) {
			reader.next();
			text = reader.getText();
		}
		return text;
	}
}
