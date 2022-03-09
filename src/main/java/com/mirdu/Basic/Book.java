package com.mirdu.Basic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	private int bid;
	private String bname;

	@ManyToMany(targetEntity = Student1.class, cascade = { CascadeType.MERGE }, fetch = FetchType.EAGER)
	private List<Student1> stud = new ArrayList<Student1>();

	public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.stud = new ArrayList<Student1>();
	}

	public Book() {
		super();
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public List<Student1> getStud() {
		return stud;
	}

	public void setStud(Student1 st) {
		stud.add(st);
	}
}
