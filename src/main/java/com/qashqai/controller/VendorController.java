package com.qashqai.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import javax.transaction.Transactional;

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
import com.qashqai.model.Vendors;
import com.qashqai.service.IVendorService;
import com.qashqai.util.JwtUtil;

@CrossOrigin
@RestController // @Controller+@Configuration
@RequestMapping("/api")
public class VendorController {
	@Autowired
	private IVendorService vendorService;
	@Autowired
	private APIResponse apiResponse;
	@Autowired
	private JwtUtil jwtutil;
	// list vendors
	@GetMapping("/vendors")
	public List<Vendors> getEmployee(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		return vendorService.getActiveVendor();
	}

	// add vendors
	@PostMapping("/vendors")
	public ResponseEntity<APIResponse> addVendor(@RequestBody Vendors vendor,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		vendorService.saveVendor(vendor);

		apiResponse.setData("VENDOR ADDED SUCCESFULLY");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}

	// edit vendor
	@PutMapping("/vendors")
	public ResponseEntity<APIResponse> updateVendor(@RequestBody Vendors vendor,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		System.out.println(vendor);
		vendorService.saveVendor(vendor);

		apiResponse.setData("VENDOR UPDATED SUCCESFULLY");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}

	// search vendors
	@GetMapping("/vendors/{id}")
	public Vendors getVendor(@PathVariable int id,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		return vendorService.getVendor(id);
	}

	// disable vendor
	@GetMapping("/vendors/disable/{id}")
	public ResponseEntity<APIResponse> disableVendor(@PathVariable int id,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		vendorService.disableVendor(id);
		apiResponse.setData("VENDOR DISABLED SUCCESFULLY");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}

}
