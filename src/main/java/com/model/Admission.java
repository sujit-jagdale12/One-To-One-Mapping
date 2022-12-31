package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admission {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Admission_Id")
	private int ad_id;
	@Column(name = "Branch")
	private String branch;
	@Column(name = "College_Name")
	private String college;
	@Column(name = "Admission_Date")
	private String ad_date;

	public Admission() {
	}

	public Admission(String branch, String college, String ad_date) {
		this.branch = branch;
		this.college = college;
		this.ad_date = ad_date;
	}

	public int getAd_id() {
		return ad_id;
	}

	public void setAd_id(int ad_id) {
		this.ad_id = ad_id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getAd_date() {
		return ad_date;
	}

	public void setAd_date(String ad_date) {
		this.ad_date = ad_date;
	}

}
