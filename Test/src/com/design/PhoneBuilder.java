package com.design;

public class PhoneBuilder {
	private String OS;
	private String name;
	private String ram;
	public PhoneBuilder setOS(String oS) {
		this.OS = oS;
		return this;
	}
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	
	public Phone getPhone(){
		Phone p= new Phone(OS,name,ram);
		return p;
	}
	

}
