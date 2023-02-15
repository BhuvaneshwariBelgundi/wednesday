package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empname;
	private String gender;
	private String DOB;
	private String country;
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname=empname;
		
	}
		
	}

