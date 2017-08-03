package edu.acc.java;

import java.io.Serializable;

public class HeaderBeanSingle implements Serializable {

	private String name;
	private String value;
	
	HeaderBeanSingle() {}
	HeaderBeanSingle(String name, String value) {
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
