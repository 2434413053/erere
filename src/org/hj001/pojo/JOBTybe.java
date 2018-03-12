package org.hj001.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class JOBTybe {
	
	private Integer jtid;
	private String jtno;
	private String jtname;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getJtid() {
		return jtid;
	}
	public void setJtid(Integer jtid) {
		this.jtid = jtid;
	}
	public String getJtno() {
		return jtno;
	}
	public void setJtno(String jtno) {
		this.jtno = jtno;
	}
	public String getJtname() {
		return jtname;
	}
	public void setJtname(String jtname) {
		this.jtname = jtname;
	}
	
}
