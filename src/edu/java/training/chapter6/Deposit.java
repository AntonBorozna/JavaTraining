package edu.java.training.chapter6;

public class Deposit {
	
	private int id;
	private int length;	
	private String lengthType;
	private String currency;
	private String type;
	private double percent;
	private double quantity;
	
	Deposit(){};
		
	Deposit(String lengthType, int length, String currency, String type, double percent, double quantity){
		this.setLengthType(lengthType);
		this.setLength(length);
		this.setCurrency(currency);
		this.setType(type);
		this.setPercent(percent);
		this.setQuantity(quantity);
	}		
	
	Deposit(String lengthType, String currency, String type, double percent, double quantity){
		this.setLengthType(lengthType);
		this.setCurrency(currency);
		this.setType(type);
		this.setPercent(percent);
		this.setQuantity(quantity);
	}		

	
	public String getLengthType() {
		return lengthType;
	}

	public void setLengthType(String lengthType) {
		this.lengthType = lengthType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	
	@Override
	public String toString() {
		return "Deposit [id=" + id + ", length=" + length + ", lengthType=" + lengthType + ", currency=" + currency
				+ ", type=" + type + ", percent=" + percent + ", quantity=" + quantity + "]";
	}	
		
}