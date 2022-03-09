package com.mirdu.Basic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student1 {
	@Id
	private int sid;
	private String sname;

	@ManyToMany(targetEntity = Book.class, cascade = { CascadeType.MERGE }, fetch = FetchType.EAGER)
	private List<Book> sbook;

	public Student1() {
		super();
	}

	public Student1(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sbook = new ArrayList<Book>();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Book> getSbook() {
		return sbook;
	}

	public void setSbook(Book book) {
		sbook.add(book);
	}
}
