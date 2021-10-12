package edu.java.training.chapter15.entity;

public class Device {
	private String name;

	private String origin;
	private int price;
	private boolean critical;
	private Type type = new Type();

	public Device() {
	}

	public Device(String name, String origin, int price, boolean citical, Type type) {
		super();
		this.name = name;
		this.origin = origin;
		this.price = price;
		this.critical = citical;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isCritical() {
		return critical;
	}

	public void setCritical(boolean citical) {
		this.critical = citical;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Device [name=" + name + ", origin=" + origin + ", price=" + price + ", citical=" + critical + ", type="
				+ type + "]";
	}

	public class Type {
		private String group;
		private int powerConsumption;
		private boolean cooler;

		public Type() {
		}

		public Type(String group, int powerConsumption, boolean cooler) {
			super();
			this.group = group;
			this.powerConsumption = powerConsumption;
			this.cooler = cooler;
		}

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public int getPowerConsumption() {
			return powerConsumption;
		}

		public void setPowerConsumption(int powerConsumption) {
			this.powerConsumption = powerConsumption;
		}

		public boolean isCooler() {
			return cooler;
		}

		public void setCooler(boolean cooler) {
			this.cooler = cooler;
		}

		@Override
		public String toString() {
			return "Type [group=" + group + ", powerConsumption=" + powerConsumption + ", cooler=" + cooler + "]";
		}

	}

}
