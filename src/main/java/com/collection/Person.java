package com.collection;

import java.util.*;
public class Person {
	
	private String name;
	
	private List<String> phones;
	
	private Set<String> addresses;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phones
	 */
	public List<String> getPhones() {
		return phones;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	/**
	 * @return the addresses
	 */
	public Set<String> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	
	

}
