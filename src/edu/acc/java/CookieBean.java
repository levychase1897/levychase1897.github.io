package edu.acc.java;

import java.io.Serializable;

public class CookieBean implements Serializable {
	
	private String name;
	private String value;
	
    public CookieBean() {}

    public CookieBean(String name, String value) {
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
