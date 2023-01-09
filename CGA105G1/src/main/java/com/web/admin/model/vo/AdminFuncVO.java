package com.web.admin.model.vo;

public class AdminFuncVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	
	public Integer getAdminID() {
		return id;
	}
	public void setAdminID(Integer id) {
		this.id = id;
	}
	public String getAdminName() {
		return name;
	}
	public void setAdminName(String name) {
		this.name = name;
	}
	
	
}
