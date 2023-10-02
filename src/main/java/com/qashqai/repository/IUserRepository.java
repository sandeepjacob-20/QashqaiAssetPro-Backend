package com.qashqai.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qashqai.model.Users;

@Repository
public interface IUserRepository extends CrudRepository<Users, Integer> {

	// custom method
	@Query("from Users WHERE userName=?1 AND password=?2 AND role_id=1")
	public Users findAdminByUserNameAndPassword(String userName, String password);

	// custom method
	@Query("from Users WHERE userName=?1 AND password=?2 AND role_id=2")
	public Users findUserByUserNameAndPassword(String userName, String password);
}
