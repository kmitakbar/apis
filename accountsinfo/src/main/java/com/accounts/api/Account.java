package com.accounts.api;

public class Account {

	private Integer accoundNumber;
	private String accountHolderName;
	private String phone;
	private String email;
	private String accountProvider;
	public Integer getAccoundNumber() {
		return accoundNumber;
	}
	public void setAccoundNumber(Integer accoundNumber) {
		this.accoundNumber = accoundNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccountProvider() {
		return accountProvider;
	}
	public void setAccountProvider(String accountProvider) {
		this.accountProvider = accountProvider;
	}
	@Override
	public String toString() {
		return "Account [accoundNumber=" + accoundNumber + ", accountHolderName=" + accountHolderName + ", phone="
				+ phone + ", email=" + email + ", accountProvider=" + accountProvider + "]";
	}
	public Account(Integer accoundNumber, String accountHolderName, String phone, String email,
			String accountProvider) {
		super();
		this.accoundNumber = accoundNumber;
		this.accountHolderName = accountHolderName;
		this.phone = phone;
		this.email = email;
		this.accountProvider = accountProvider;
	}
	
	public Account() {
		
	}
}
