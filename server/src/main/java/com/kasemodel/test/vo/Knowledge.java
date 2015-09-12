package com.kasemodel.test.vo;

public class Knowledge {

	private String name;
	private Integer value;

	public Knowledge() {
	}

	public Knowledge(String name, Integer value) {
		setName(name);
		setValue(value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
