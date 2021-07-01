package com.bridgelabz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

//import lombok.ToString;

public  class EmployeePayrollDTO {
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z]{2,}$",message="Employee Name Invalid")
	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public List<String> getDepartment() {
		return department;
	}

	public void setDepartment(List<String> department) {
		this.department = department;
	}

	@Min(value=500,message="Employee Wage should be more than 500")
	public long salary;
	@Pattern(regexp="male|female",message="Gender needs to be male or female")
	public String gender;
	
	@JsonFormat(pattern="dd MMM yyyy")
	@NotNull(message="startDate should not be empty")
	@PastOrPresent(message="startDate should be past or todays date")
	public LocalDate startDate;
	
	@NotBlank(message="note should not be blank")
	public String note;
	@NotBlank(message="profilePic should not be blank")
	public String profilePic;
	
	@NotNull(message = "department should not be empty")
	public List<String> department;
}