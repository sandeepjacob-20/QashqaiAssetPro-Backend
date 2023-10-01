package com.qashqai.service;

import com.qashqai.common.APIResponse;
import com.qashqai.model.Users;

public interface IUserService {
	//add user
	public Users saveUser(Users user);
	
	//verify admin
	public APIResponse findAdminByNameAndPassword(String userName, String password);
	
	//verify Customer
	public APIResponse findUserByNameAndPassword(String userName, String password);
}
