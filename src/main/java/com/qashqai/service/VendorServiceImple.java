package com.qashqai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qashqai.model.Vendors;
import com.qashqai.repository.IVendorRepository;
@Service
public class VendorServiceImple implements IVendorService{
	
	@Autowired
	private IVendorRepository vendorRepo;

	@Override
	public List<Vendors> getVendor() {
		// TODO Auto-generated method stub
		return (List<Vendors>)vendorRepo.findAll();
	}

	@Override
	public Vendors saveVendor(Vendors vendor) {
		// TODO Auto-generated method stub
	return  vendorRepo.save(vendor);
	}

}
