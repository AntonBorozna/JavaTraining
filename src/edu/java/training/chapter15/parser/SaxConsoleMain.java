package edu.java.training.chapter15.parser;

import edu.java.training.chapter15.transform.XmlDocumentCreator;

public class SaxConsoleMain {
	public static void main(String[] args) {
		
		//DOM
		DeviceDomBuilder domBuilder = new DeviceDomBuilder();
		domBuilder.BuildSetDevices("resources/Devices.xml");
		System.out.println(domBuilder.getDevices());

		//SAX
		DevicesSaxBuilder saxBuilder = new DevicesSaxBuilder();
		saxBuilder.buildSetDevices("resources/Devices.xml");
		System.out.println(saxBuilder.getStudents());
		
		//StAX		
		DeviceStaxBuilder staxBuilder = new DeviceStaxBuilder();
		staxBuilder.buildSetDevices("resources/Devices.xml");
		System.out.println(staxBuilder.getDevices());
		
		XmlDocumentCreator creator = new XmlDocumentCreator();
		creator.createDocument(domBuilder.getDevices());
	}	
}
