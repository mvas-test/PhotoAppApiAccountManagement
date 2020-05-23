package com.appsdeveloper.photoapp.api.accountmanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountManagementController {
	
	@GetMapping("/status/check")
	public String status() {
		return "Account service is Working";
	}

}
