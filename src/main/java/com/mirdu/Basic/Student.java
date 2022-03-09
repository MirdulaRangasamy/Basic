package com.mirdu.Basic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

//@Entity
//@NamedQueries({@NamedQuery(name="Find_Name", query="select s.name from Student s"),@NamedQuery(name="Find_Rollno", query="select s.rollno from Student s where s.name='Ria'")})
//@NamedQuery(name="Find_Name", query="select s from Student s where s.rollno>101")
public class Student {
	@Id
	private int rollno;
	private String name;
	private float cgpa;
	
	public Student() {
		super();
	}
	
	public Student(int rollno, String name, float cgpa) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", cgpa=" + cgpa + "]";
	}	
}
