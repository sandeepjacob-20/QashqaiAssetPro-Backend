package com.qashqai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qashqai.common.APIResponse;
import com.qashqai.model.Vendors;
import com.qashqai.service.IVendorService;

@CrossOrigin
@RestController // @Controller+@Configuration
@RequestMapping("/api")
public class VendorController {
	@Autowired
	private IVendorService vendorService;
	@Autowired	
	private APIResponse apiResponse;
	
	//list vendors
	@GetMapping("/vendor")
	public List<Vendors> getEmployee() {
		return vendorService.getVendor();
	}
	
	//add vendors
	@PostMapping("/vendor")
	public ResponseEntity<APIResponse> addVendor(@RequestBody Vendors vendor){
		if(vendorService.saveVendor(vendor)==null) {
			apiResponse.setData("Name can have only alphabets");
			apiResponse.setStatus(500);
			apiResponse.setError("INVALID NAME");
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("VENDOR ADDED SUCCESFULLY");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	
		
		
	}
	
}
