package com.qashqai.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qashqai.model.Vendors;

@Repository
public interface IVendorRepository extends CrudRepository<Vendors,Integer>{
	@Modifying
	@Query("UPDATE com.qashqai.model.Vendors SET isActive=false WHERE id=?1")
	public void disableVendor(int id);

}
