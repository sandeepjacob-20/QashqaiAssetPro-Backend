package com.qashqai.service;

import java.util.List;

import com.qashqai.model.PurchaseOrder;

public interface IPurchaseService {
	// To list all orders
	public List<PurchaseOrder> getAll();

	// To add new orders
	public PurchaseOrder saveOrder(PurchaseOrder order);

	// delete
	public PurchaseOrder deleteOrder(int pdId);

	//search by id
	public PurchaseOrder getOrderById(int pdId);

	//list by statusid
	public List<PurchaseOrder> listByStatus();

}
