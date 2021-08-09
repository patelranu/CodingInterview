package com.design;

public class Phone {
	private String OS;
	private String name;
	private String ram;
	public Phone(String oS, String name, String ram) {
		OS = oS;
		this.name = name;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", name=" + name + ", ram=" + ram + "]";
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	

}
