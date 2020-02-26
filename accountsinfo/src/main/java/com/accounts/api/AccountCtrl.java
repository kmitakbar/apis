package com.accounts.api;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountCtrl {

	private static List<Account> accounts = new ArrayList<>();

	@GetMapping("/phonenumber/{number}")
	public Account getAccountByPhone(@PathVariable String number) {
		for (Account account : accounts) {
			if (account.getPhone().equalsIgnoreCase(number)) {
				return account;
			}
		}
		return null;
	}

	@GetMapping("/accounts")
	public List<Account> getAllAccounts() {
		
		return accounts;
	}

	@GetMapping("/email/{email}")
	public Account getAccountByEmail(@PathVariable String email) {
		System.out.println("receievd email"+email);
		for (Account account : accounts) {
			if (account.getEmail().equalsIgnoreCase(email)) {
				return account;
			}
		}
		return null;
	}
	
	@PostConstruct
	public void initialize() {
		accounts.add(new Account(100000, "Akbar", "1234567", "akbarmd@gmail.com", "HDFC"));
		accounts.add(new Account(100001, "Surya", "787878", "surya@gmail.com", "HDFC"));
		accounts.add(new Account(100000, "Rehaan", "909090", "rehaan@gmail.com", "Axis"));
		accounts.add(new Account(100001, "Sanaa", "80808080", "sanaa@gmail.com", "Axis"));
	}
}
