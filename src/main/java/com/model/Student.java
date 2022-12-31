package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Stud_admission")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Stud_id")
	private int id;
	@Column(name = "Stud_FirstName")
	private String firstname;
	@Column(name = "Stud_LastName")
	private String lastname;
	@OneToOne(targetEntity = Admission.class, cascade = CascadeType.ALL)
	private Admission admission;

	public Student() {
	}

	public Student(String firstname, String lastname, Admission admission) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.admission = admission;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Admission getAdmission() {
		return admission;
	}

	public void setAdmission(Admission admission) {
		this.admission = admission;
	}

}
