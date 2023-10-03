package com.qashqai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qashqai.model.PurchaseStatus;
import com.qashqai.service.IStatusService;



@CrossOrigin
@RestController // @Controller+@Configuration
@RequestMapping("/api")
public class StatusController {
	@Autowired
	IStatusService statusService;
	@GetMapping("/status/get")
	public List<PurchaseStatus> getOrders() {
		return statusService.getAll();
	}
}
