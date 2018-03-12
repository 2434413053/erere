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
public class JOB {
	
	private Integer jid;
	private String jobno;
	private String jobname;
	private JOBTybe JOBTybe;
	private Integer jobLevel;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getJobno() {
		return jobno;
	}
	public void setJobno(String jobno) {
		this.jobno = jobno;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	@OneToOne
	@JoinColumn(name="jtid")
	public JOBTybe getJOBTybe() {
		return JOBTybe;
	}
	public void setJOBTybe(JOBTybe jOBTybe) {
		JOBTybe = jOBTybe;
	}
	public Integer getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(Integer jobLevel) {
		this.jobLevel = jobLevel;
	}
}
