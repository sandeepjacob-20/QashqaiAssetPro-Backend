package com.qashqai.service;

import com.qashqai.common.APIResponse;
import com.qashqai.model.Users;

public interface IUserService {
	//add user
	public Users saveUser(Users user);
	
	//verify login
	public APIResponse loginByNameAndPassword(String userName, String password);
	
}
