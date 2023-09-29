package com.qashqai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qashqai.model.Vendor;
import com.qashqai.repository.IVendorRepository;

public class VendorServiceImple implements IVendorService{
	
	@Autowired
	private IVendorRepository vendorRepo;

	@Override
	public List<Vendor> getVendor() {
		// TODO Auto-generated method stub
		return (List<Vendor>)vendorRepo.findAll();
	}

}
