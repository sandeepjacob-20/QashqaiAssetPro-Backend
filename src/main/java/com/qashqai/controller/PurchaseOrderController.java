package com.qashqai.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.qashqai.common.APIResponse;
import com.qashqai.model.PurchaseOrder;
import com.qashqai.service.IPurchaseService;
import com.qashqai.util.JwtUtil;

@CrossOrigin
@RestController // @Controller+@Configuration
@RequestMapping("/api")
public class PurchaseOrderController {
	@Autowired
	private IPurchaseService purchaseService;
	@Autowired
	private APIResponse apiresponse;
	@Autowired
	private JwtUtil jwtutil;
	// add
	@GetMapping("/orders/get")
	public List<PurchaseOrder> getOrders(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		return purchaseService.getActiveOrders();
	}

	// insert new order
	@PostMapping("/orders/insert")
	public ResponseEntity<APIResponse> addOrder(@RequestBody PurchaseOrder purchaseOrder,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		if (purchaseService.saveOrder(purchaseOrder) == null) {
			apiresponse.setData("name can have only alphabet!");
			apiresponse.setStatus(500);
			apiresponse.setError("invalid name");

			return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);

		}
		apiresponse.setData("order added successfuly");
		apiresponse.setStatus(200);
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);

	}

	// edit the order
	@PutMapping("orders/edit")
	public void updateOrders(@RequestBody PurchaseOrder purchaseOrder,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		purchaseService.saveOrder(purchaseOrder);
	}

	// delete ORDER
	@GetMapping("/orders/delete/{pdId}")
	public void deleteEmployee(@PathVariable int pdId,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		purchaseService.deleteOrder(pdId);
	}

	// search by Id
	@GetMapping("/orders/searchbyid/{pdId}")
	public PurchaseOrder getOrder(@PathVariable int pdId,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		return purchaseService.getOrderById(pdId);
	}

	// list by statusId
	@GetMapping("/orders/listbystatus")
	public List<PurchaseOrder> getOrderByStatus(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		return purchaseService.listByStatus();
	}

}
