package com.mirdu.Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private Address address;
//	private Address addr;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	  public Address getAddr() { return address; } 
	  public void setAddr(Address addr) {
	  this.address = addr; }
	 

	/*
	 * public Map<Integer,Address> getAddr() { return address; }
	 * 
	 * public void setAddr(Map<Integer,Address> addr) { this.address = addr; }
	 */
}
