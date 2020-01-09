package javadb200106;

import java.sql.Date;

public class Nail {
	
	// 고객등록
	private int customerNo;
	private String name;
	private String birth;
	private String phone;
	private int acommuter;
	
	public int getCustomerNo() {
		return customerNo;
	}
	
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public void setBirth(String birth2) {
		this.birth = birth2;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getAcommuter() {
		return acommuter;
	}
	
	public void setAcommuter(int acommuter) {
		this.acommuter = acommuter;
	}
	
	// 예약
	private String member;
	private String to_char;
	private String administration;
	private String desigantion;

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getTo_char() {
		return to_char;
	}

	public void setTo_char(String to_char) {
		this.to_char = to_char;
	}

	public String getAdministration() {
		return administration;
	}

	public void setAdministration(String administration) {
		this.administration = administration;
	}

	public String getDesigantion() {
		return desigantion;
	}

	public void setDesigantion(String desigantion) {
		this.desigantion = desigantion;
	}

	@Override
	public String toString() {
		return "Nail [customerNo=" + customerNo + ", name=" + name + ", birth=" + birth + ", phone=" + phone
				+ ", acommuter=" + acommuter + "]";
	}
	
	
	
	
}
