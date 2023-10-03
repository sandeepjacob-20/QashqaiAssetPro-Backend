package com.qashqai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.qashqai.model.PurchaseOrder;
import com.qashqai.repository.IPurchaseRepository;
@Service
public class PurchaseServiceImple implements IPurchaseService {
	
	@Autowired
	private IPurchaseRepository purchaseRepo;
	
	public List<PurchaseOrder> getAll() {
		// TODO Auto-generated method stub
		return (List<PurchaseOrder>) purchaseRepo.findAll();
	}

	public PurchaseOrder saveOrder(PurchaseOrder order) {
		// TODO Auto-generated method stub
		return purchaseRepo.save(order);
	}

	@Transactional
	public PurchaseOrder deleteOrder(int id) {
		purchaseRepo.deleteOrder(id);
		return null;
	}
	
	public PurchaseOrder getOrderById(int pdId) {
		return  purchaseRepo.findById(pdId).orElseThrow(()-> new
				RuntimeException("purchase order not found for id"+pdId));
	}

	@Override
	public List<PurchaseOrder> listByStatus(int statusId) {
		// TODO Auto-generated method stub
		return purchaseRepo.listByStatus(statusId);
	}
	
}
