package edu.java.training.chapter15.parser;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import edu.java.training.chapter15.entity.Device;

public class DeviceDomBuilder {
	private Set<Device> devices;
	private DocumentBuilder docBuilder;

	public DeviceDomBuilder() {
		devices = new HashSet<Device>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			docBuilder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}

	public Set<Device> getDevices() {
		return devices;
	}

	public void BuildSetDevices(String filename) {
		Document doc;
		try {
			doc = docBuilder.parse(filename);
			Element root = doc.getDocumentElement();
			NodeList devicesList = root.getElementsByTagName("device");
			for (int i = 0; i < devicesList.getLength(); i++) {
				Element deviceElement = (Element) devicesList.item(i);
				Device device = buildDevice(deviceElement);
				devices.add(device);
			}
		} catch (IOException | SAXException e) {
			e.printStackTrace();
		}
	}

	private Device buildDevice(Element deviceElement) {
		Device device = new Device();
		device.setName(deviceElement.getAttribute("name"));
		device.setOrigin(deviceElement.getAttribute("origin"));
		Integer price = Integer.parseInt(getElementTextContent(deviceElement, "price"));
		device.setPrice(price);
		Boolean critical = Boolean.parseBoolean(getElementTextContent(deviceElement, "critical"));
		device.setCritical(critical);
		Device.Type type = device.getType();
		Element typeElement = (Element) deviceElement.getElementsByTagName("type").item(0);
		type.setGroup(getElementTextContent(typeElement, "group"));
		Integer power = Integer.parseInt(getElementTextContent(deviceElement, "powerConsumption"));
		type.setPowerConsumption(power);
		Boolean cooler = Boolean.parseBoolean(getElementTextContent(deviceElement, "price"));
		type.setCooler(cooler);
		return device;
	}

	private static String getElementTextContent(Element element, String elementName) {
		NodeList nList = element.getElementsByTagName(elementName);
		Node node = nList.item(0);
		String text = node.getTextContent();
		return text;
	}
}
