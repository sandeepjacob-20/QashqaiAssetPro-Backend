package com.qashqai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qashqai.common.APIResponse;
import com.qashqai.model.PurchaseOrder;
@CrossOrigin
@RestController// @Controller+@Configuration
@RequestMapping("/api")
public class PurchaseOrderController {
	
	@Autowired
	private APIResponse apiresponse;
	
	@GetMapping("/orders/get")
	
	public List<PurchaseOrder> getOrders()
	{
		return null;
		
	}
	@PostMapping("/orders/push")
	public ResponseEntity<APIResponse> addOrder (@RequestBody PurchaseOrder purchaseOrder){
		return null;
		
	}
	@PutMapping("orders/edit")
	public void updateOrders(@RequestBody PurchaseOrder purchaseOrder) {
			
	}
}
