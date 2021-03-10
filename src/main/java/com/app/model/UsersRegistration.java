package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usrTabs")
public class UsersRegistration {
	@Id
	@GeneratedValue
	@Column(name="uid")
	private Integer usrid;
	@Column(name="uname")
	private String usrName;
	@Column(name="upass")
	private String usrPwd;
	@Column(name="gen")
	private String usrGen;
	@Column(name="uaddr")
	private String usrAdd;
	@Column(name="status")
	private String usrEnable;
	@Column(name="country")
	private String usrCountry;
	public UsersRegistration() {
		super();
	}
	
	public UsersRegistration(Integer usrid) {
		super();
		this.usrid = usrid;
	}

	public Integer getUsrid() {
		return usrid;
	}
	public void setUsrid(Integer usrid) {
		this.usrid = usrid;
	}
	public String getUsrName() {
		return usrName;
	}
	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
	public String getUsrPwd() {
		return usrPwd;
	}
	public void setUsrPwd(String usrPwd) {
		this.usrPwd = usrPwd;
	}
	public String getUsrGen() {
		return usrGen;
	}
	public void setUsrGen(String usrGen) {
		this.usrGen = usrGen;
	}
	public String getUsrAdd() {
		return usrAdd;
	}
	public void setUsrAdd(String usrAdd) {
		this.usrAdd = usrAdd;
	}
	public String getUsrEnable() {
		return usrEnable;
	}
	public void setUsrEnable(String usrEnable) {
		this.usrEnable = usrEnable;
	}
	public String getUsrCountry() {
		return usrCountry;
	}
	public void setUsrCountry(String usrCountry) {
		this.usrCountry = usrCountry;
	}
	@Override
	public String toString() {
		return "UsersRegistration [usrid=" + usrid + ", usrName=" + usrName + ", usrPwd=" + usrPwd + ", usrGen="
				+ usrGen + ", usrAdd=" + usrAdd + ", usrEnable=" + usrEnable + ", usrCountry=" + usrCountry + "]";
	}
	
}
