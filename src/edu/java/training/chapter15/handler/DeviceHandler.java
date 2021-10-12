package edu.java.training.chapter15.handler;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import edu.java.training.chapter15.entity.Device;

public class DeviceHandler extends DefaultHandler {
	private Set<Device> devices;
	private Device current;
	private DeviceXmlTag currentXmlTag;
	private EnumSet<DeviceXmlTag> withText;
	private static final String ELEMENT_DEVICE = "device";

	public DeviceHandler() {
		devices = new HashSet<Device>();
		withText = EnumSet.range(DeviceXmlTag.NAME, DeviceXmlTag.COOLER);
	}

	public Set<Device> getDevices() {
		return devices;
	}

	public void startElement(String uri, String localName, String qName, Attributes attrs) {
		if (ELEMENT_DEVICE.equals(qName)) {
			current = new Device();
			current.setName(attrs.getValue(0));
			if (attrs.getLength() == 2) {
				current.setOrigin(attrs.getValue(1));
			}
		} else {
			DeviceXmlTag temp = DeviceXmlTag.valueOf(qName.toUpperCase());
			if (withText.contains(temp)) {
				currentXmlTag = temp;
			}
		}
	}

	public void endElement(String uri, String localName, String qName) {
		if (ELEMENT_DEVICE.equals(qName)) {
			devices.add(current);
		}
	}

	public void characters(char[] ch, int start, int length) {
		String data = new String(ch, start, length).strip();
		if (currentXmlTag != null) {
			switch (currentXmlTag) {
			case PRICE -> current.setPrice(Integer.parseInt(data));
			case CRITICAL -> current.setCritical(Boolean.parseBoolean(data));
			case GROUP -> current.getType().setGroup(data);
			case POWERCONSUMPTION -> current.getType().setPowerConsumption(Integer.parseInt(data));
			case COOLER -> current.getType().setCooler(Boolean.parseBoolean(data));
			default -> throw new EnumConstantNotPresentException(currentXmlTag.getDeclaringClass(),
					currentXmlTag.name());
			}
		}
		currentXmlTag = null;
	}
}
