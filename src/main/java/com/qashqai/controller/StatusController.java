package com.qashqai.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qashqai.model.PurchaseStatus;
import com.qashqai.service.IStatusService;
import com.qashqai.util.JwtUtil;



@CrossOrigin
@RestController // @Controller+@Configuration
@RequestMapping("/api")
public class StatusController {
	@Autowired
	IStatusService statusService;
	@Autowired
	private JwtUtil jwtutil;
	@GetMapping("/status/get")
	public List<PurchaseStatus> getOrders(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		return statusService.getAll();
	}
}
