package com.exam.OEPModel;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

	@Entity
	@Table(name="Users") 
	public class User implements Serializable
	{
		private static final long serialVersionUID=1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int userId;
		
		//@NotNull(message="name field must not be empty")
	    //@Size(min = 2, message = "user name must have atleast two character")
		private String name;
		
		//@NotNull(message = "email field must not be empty")
		//@Email(message = "email should be in valid format")
		private String emailId;
		
		//@Range(min=10,max=15, message = "mobile_no should be exact 10 characters." )
		private int mobileNo;
		
		//@NotNull(message = "Password field must not be empty")
		//@Size(min = 5, message = "Password must have atleast 5 character")
		private String password;
		
		//@NotNull
		//@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		//@JoinColumn(name="address_id")
		private UserAddress address;
		
		

		public User() {
			super();
		}
		
		
		public User(String name, String emailId, int mobileNo, String password, UserAddress address) {
			super();
			this.name = name;
			this.emailId = emailId;
			this.mobileNo = mobileNo;
			this.password = password;
			this.address = address;
		}





		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public UserAddress getAddress() {
			return address;
		}

		public void setAddress(UserAddress address) {
			this.address = address;
		}
		

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public int getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(int mobileNo) {
			this.mobileNo = mobileNo;
		}
		

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", name=" + name + ", emailId=" + emailId + ", mobileNo=" + mobileNo
					+ ", password=" + password + ", address=" + address + "]";
		}

		

		
	}


