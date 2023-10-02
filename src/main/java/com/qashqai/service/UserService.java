package com.qashqai.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qashqai.common.APIResponse;
import com.qashqai.common.Validation;
import com.qashqai.model.Users;
import com.qashqai.repository.IUserRepository;
import com.qashqai.util.JwtUtil;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private Validation validation;
	
	@Autowired
	private JwtUtil jwtutil;

	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private APIResponse apiResponse;
	
	
	@Override
	public APIResponse loginByNameAndPassword(String userName, String password) {
		//verify user exist or not
		Users user = userRepository.loginByUserNameAndPassword(userName, password);
		
		if(user==null) {
			apiResponse.setData("INVALID CREDENTIALS");
			return apiResponse;
		}
		
		//credentials are correct then
		String token = jwtutil.generateJwt(user);
		
		//storing more details and tokens
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("ACCESS TOKEN", token);
		data.put("role", user.getRoleId());
		data.put("UserName",user.getUserName());
		
		apiResponse.setStatus(200);
		apiResponse.setData(data);
		
		return apiResponse;
		
	}
	

	//save users
	@Override
	public Users saveUser(Users user) {
		if(validation.isNameValid(user.getUserName())) {
			return userRepository.save(user);
		}
		return null;
	}

}
