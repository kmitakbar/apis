package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/api")
public class CustomerCtrl {

	public static List<Customer> customers = new ArrayList<>();

	@GetMapping("/heartbeat")
	public String ping() {
		return "app is fine!";
	}

	@PostMapping("/save")
	public Customer createCustomer(Customer customer) {
		customer.setCustomerId(UUID.randomUUID().toString());
		customers.add(customer);
		return customer;
	}

	@GetMapping("/customerById")
	public Customer getCustomer(@RequestParam("customerId") String cid) {
		for (Customer customer : customers) {
			if (customer.getCustomerId().equalsIgnoreCase(cid)) {
				return customer;
			}
		}
		return null;
	}

	@GetMapping("/getall")
	public List<Customer> getAllCustomer() {
		return customers;
	}
	
	@GetMapping("/cleanup")
	public String refreshData() {
		customers=new ArrayList<>();
		return "clean up done!";
	}
}
