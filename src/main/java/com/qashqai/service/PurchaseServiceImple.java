/*package com.qashqai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

}*/
