package com.qashqai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qashqai.model.PurchaseOrder;

@Repository

public interface IPurchaseRepository extends CrudRepository<PurchaseOrder, Integer> {
	
	@Modifying
	@Query("UPDATE com.qashqai.model.PurchaseOrder SET isActive=0 WHERE pdId=?1")
	public void deleteOrder(int pdId);

	@Query("from com.qashqai.model.PurchaseOrder where statusId=4")
	public List<PurchaseOrder> listByStatus();
	
	@Query("from com.qashqai.model.PurchaseOrder where isActive=true")
	public List<PurchaseOrder> getActiveVendor();
	
}
