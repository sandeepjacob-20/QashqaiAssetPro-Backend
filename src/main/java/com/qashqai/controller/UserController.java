package com.qashqai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qashqai.common.APIResponse;
import com.qashqai.model.Users;
import com.qashqai.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private APIResponse apiResponse;
	
	@Autowired
	private IUserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<APIResponse> addUser(@RequestBody Users user){
		if(userService.saveUser(user)==null) {
			apiResponse.setData("Name can have only alphabets!!");
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid Name");
			
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}
	apiResponse.setData("User added successfully");
	apiResponse.setStatus(200);
	
	return ResponseEntity
			.status(apiResponse.getStatus()).body(apiResponse);
	}
	
	//for admin
	@GetMapping("/adminlogin/{userName}&{password}")
	public ResponseEntity<APIResponse> findAdminByNameAndPassword
	(@PathVariable String userName, @PathVariable String password){
		APIResponse apiresponse = userService.findAdminByNameAndPassword(userName, password);
		
		return ResponseEntity.status(apiresponse.getStatus())
				.body(apiresponse);
	}
	
	//for Customer
	@GetMapping("/userlogin/{userName}&{password}")
	public ResponseEntity<APIResponse> findUserByNameAndPassword
	(@PathVariable String userName, @PathVariable String password){
		System.out.println(	userName );
		APIResponse apiresponse = userService.findUserByNameAndPassword(userName, password);
		
		return ResponseEntity.status(apiresponse.getStatus())
				.body(apiresponse);
	}
}
