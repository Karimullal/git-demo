package com.accountmicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/account")
public class AccountManagementController {

	@GetMapping
	private String status() {
		return "Account management service..";
	}
}
