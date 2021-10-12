package edu.java.training.chapter15.parser;

import java.io.IOException;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import edu.java.training.chapter15.entity.Device;
import edu.java.training.chapter15.handler.DeviceErrorHandler;
import edu.java.training.chapter15.handler.DeviceHandler;

public class DevicesSaxBuilder {
	private Set<Device> students;
	private DeviceHandler handler = new DeviceHandler();
	private XMLReader reader;

	public DevicesSaxBuilder() {		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = factory.newSAXParser();
			reader = saxParser.getXMLReader();
		} catch (ParserConfigurationException | SAXException e) {
			e.printStackTrace(); 
		}
		reader.setErrorHandler(new DeviceErrorHandler());
		reader.setContentHandler(handler);
	}

	public Set<Device> getStudents() {
		return students;
	}

	public void buildSetDevices(String filename) {
		try {
			reader.parse(filename);
		} catch (IOException | SAXException e) {
			e.printStackTrace(); 
		}
		students = handler.getDevices();
	}
}
