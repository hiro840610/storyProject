package com.web.admin.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@IdClass(Admin.class)
@Table(name = "staff_admin_per", catalog = "ipetdb")
public class Admin implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ADMIN_PER_ID")
		private Integer adminID;
	@Id
	@Column(name = "STAFF_ID")
		private Integer staffID;
		
		public Integer getAdminID() {
			return adminID;
		}
		public void setAdminID(Integer adminID) {
			this.adminID = adminID;
		}
		public Integer getStaffID() {
			return staffID;
		}
		public void setStaffID(Integer staffID) {
			this.staffID = staffID;
		}
		
		

}
