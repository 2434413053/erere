package org.hj001.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class EmpEducation {
	
	private Integer edid;
	private Employee Employee;
	private Integer education;
	private String eduType;
	private String eduMajor;
	private String eduWay;
	private String  beginTime;
	private String endTime;
	private String eduDesc;
	private String eduSchool;
	private String degree;
	private String degreeConferringUnit;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEdid() {
		return edid;
	}
	public void setEdid(Integer edid) {
		this.edid = edid;
	}
	@OneToOne
	@JoinColumn(name="did")
	public Employee getEmployee() {
		return Employee;
	}
	public void setEmployee(Employee employee) {
		Employee = employee;
	}
	public Integer getEducation() {
		return education;
	}
	public void setEducation(Integer education) {
		this.education = education;
	}
	public String getEduType() {
		return eduType;
	}
	public void setEduType(String eduType) {
		this.eduType = eduType;
	}
	public String getEduMajor() {
		return eduMajor;
	}
	public void setEduMajor(String eduMajor) {
		this.eduMajor = eduMajor;
	}
	public String getEduWay() {
		return eduWay;
	}
	public void setEduWay(String eduWay) {
		this.eduWay = eduWay;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEduDesc() {
		return eduDesc;
	}
	public void setEduDesc(String eduDesc) {
		this.eduDesc = eduDesc;
	}
	public String getEduSchool() {
		return eduSchool;
	}
	public void setEduSchool(String eduSchool) {
		this.eduSchool = eduSchool;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegreeConferringUnit() {
		return degreeConferringUnit;
	}
	public void setDegreeConferringUnit(String degreeConferringUnit) {
		this.degreeConferringUnit = degreeConferringUnit;
	}
}
