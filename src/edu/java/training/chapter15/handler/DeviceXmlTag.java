package edu.java.training.chapter15.handler;

public enum DeviceXmlTag {
	DEVICES("devices"), NAME("name"), ORIGIN("origin"), PRICE("price"), CRITICAL("critical"), DEVICE("device"),
	GROUP("group"), POWERCONSUMPTION("powerConsumption"), COOLER("cooler"), TYPE("type");

	private String value;

	DeviceXmlTag(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
