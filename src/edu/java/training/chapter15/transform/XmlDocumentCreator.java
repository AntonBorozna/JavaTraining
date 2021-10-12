package edu.java.training.chapter15.transform;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import edu.java.training.chapter15.entity.Device;
import edu.java.training.chapter15.handler.DeviceXmlTag;

public class XmlDocumentCreator {

	private DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

	public void createDocument(Set<Device> devices) {
		DocumentBuilder documentBuilder = null;
		List<Device> device = new ArrayList<>(devices);
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		Document document = documentBuilder.newDocument();
		String root = DeviceXmlTag.DEVICES.getValue();
		Element rootElement = document.createElement(root);
		document.appendChild(rootElement);
		for (int i = 0; i < devices.size(); i++) {
			String id = Integer.toString(i + 1);
			Element elementName = document.createElement(DeviceXmlTag.NAME.getValue());
			String name = device.get(i).getName();
			elementName.appendChild(document.createTextNode(name));
			Element elementOrigin = document.createElement(DeviceXmlTag.ORIGIN.getValue());
			String origin = device.get(i).getOrigin();
			elementOrigin.appendChild(document.createTextNode(origin));
			Element elementPrice = document.createElement(DeviceXmlTag.PRICE.getValue());
			String price = Integer.toString(device.get(i).getPrice());
			elementPrice.appendChild(document.createTextNode(price));
			Element elementCritical = document.createElement(DeviceXmlTag.CRITICAL.getValue());
			String critical = Boolean.toString(device.get(i).isCritical());
			elementCritical.appendChild(document.createTextNode(critical));
			Element elementGroup = document.createElement(DeviceXmlTag.GROUP.getValue());
			String group = device.get(i).getType().getGroup();
			elementGroup.appendChild(document.createTextNode(group));
			Element elementPower = document.createElement(DeviceXmlTag.POWERCONSUMPTION.getValue());
			String power = Integer.toString(device.get(i).getType().getPowerConsumption());
			elementPower.appendChild(document.createTextNode(power));
			Element elementCooler = document.createElement(DeviceXmlTag.COOLER.getValue());
			String cooler = Boolean.toString(device.get(i).getType().isCooler());
			elementCooler.appendChild(document.createTextNode(cooler));
			elementName.setAttribute("id", id);
			elementOrigin.setAttribute("id", id);
			elementPrice.setAttribute("id", id);
			elementCritical.setAttribute("id", id);
			elementGroup.setAttribute("id", id);
			elementPower.setAttribute("id", id);
			elementCooler.setAttribute("id", id);
			rootElement.appendChild(elementName);
			rootElement.appendChild(elementOrigin);
			rootElement.appendChild(elementPrice);
			rootElement.appendChild(elementCritical);
			rootElement.appendChild(elementGroup);
			rootElement.appendChild(elementPower);
			rootElement.appendChild(elementCooler);
		}
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		try {
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(new FileWriter("resources/newDevice.xml"));
			transformer.transform(source, result);
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException | IOException e) {
			e.printStackTrace();
		}
	}

}
