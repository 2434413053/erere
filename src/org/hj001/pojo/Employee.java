package org.hj001.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	private Integer eid;//主键
	private String eno;//人员编号
	private String ename;//人员姓名
	private Department department;//所在部门
	private Position position;//所在职位
	private String idCard;//身份证明
	private String borthday;//出生日期
	private EmpEducation empEducation;//学历
	private JOB job;//职称
	private String officephone;//办公电话
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eno=" + eno + ", ename=" + ename + ", department=" + department
				+ ", position=" + position + ", idCard=" + idCard + ", borthday=" + borthday + ", empEducation="
				+ empEducation + ", job=" + job + ", officephone=" + officephone + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@ManyToOne
	@JoinColumn(name="did")
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@ManyToOne
	@JoinColumn(name="pid")
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getBorthday() {
		return borthday;
	}
	public void setBorthday(String borthday) {
		this.borthday = borthday;
	}
	@OneToOne
	@JoinColumn(name="edid")
	public EmpEducation getEmpEducation() {
		return empEducation;
	}
	public void setEmpEducation(EmpEducation empEducation) {
		this.empEducation = empEducation;
	}
	@ManyToOne
	@JoinColumn(name="jid")
	public JOB getJob() {
		return job;
	}
	public void setJob(JOB job) {
		this.job = job;
	}
	public String getOfficephone() {
		return officephone;
	}
	public void setOfficephone(String officephone) {
		this.officephone = officephone;
	}
}

