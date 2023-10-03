package com.qashqai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.qashqai.common.APIResponse;
import com.qashqai.model.PurchaseOrder;
import com.qashqai.service.IPurchaseService;

@CrossOrigin
@RestController // @Controller+@Configuration
@RequestMapping("/api")
public class PurchaseOrderController {
	@Autowired
	private IPurchaseService purchaseService;
	@Autowired
	private APIResponse apiresponse;

	// add
	@GetMapping("/orders/get")
	public List<PurchaseOrder> getOrders() {
		return purchaseService.getAll();
	}

	// insert new order
	@PostMapping("/orders/insert")
	public ResponseEntity<APIResponse> addOrder(@RequestBody PurchaseOrder purchaseOrder) {
		if (purchaseService.saveOrder(purchaseOrder) == null) {
			apiresponse.setData("name can have only alphabet!");
			apiresponse.setStatus(500);
			apiresponse.setError("invalid name");

			return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);

		}
		apiresponse.setData("employee added successfuly");
		apiresponse.setStatus(200);
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);

	}

	// edit the order
	@PutMapping("orders/edit")
	public void updateOrders(@RequestBody PurchaseOrder purchaseOrder) {
		purchaseService.saveOrder(purchaseOrder);
	}

	// delete ORDER
	@PutMapping("/orders/delete/{pdId}")
	public void deleteEmployee(@PathVariable int pdId) {
		purchaseService.deleteOrder(pdId);
	}

	// search by Id
	@GetMapping("/orders/searchbyid/{pdId}")
	public PurchaseOrder getOrder(@PathVariable int pdId) {
		return purchaseService.getOrderById(pdId);
	}
	// list by statusId
		@GetMapping("/orders/listbystatus/{statusId}")
		public List<PurchaseOrder> getOrderByStatus(@PathVariable int statusId) {
			return purchaseService.listByStatus(statusId);
		}

}
