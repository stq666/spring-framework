package com.stq.transaction.model;

/**
 * @author stqsht@163.com
 * @date 2020-05-30 17:33
 */
public class Cat {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}
}
