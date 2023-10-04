package com.qashqai.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qashqai.model.Vendors;
import com.qashqai.repository.IVendorRepository;

@Service
public class VendorServiceImple implements IVendorService {

	@Autowired
	private IVendorRepository vendorRepo;

	// list vendors
	@Override
	public List<Vendors> getVendor() {
		// TODO Auto-generated method stub
		return (List<Vendors>) vendorRepo.findAll();
	}

	// add vendors
	@Override
	public Vendors saveVendor(Vendors vendor) {
		// TODO Auto-generated method stub
		return vendorRepo.save(vendor);
	}

	// search vendor
	@Override
	public Vendors getVendor(int id) {
		// TODO Auto-generated method stub
		return vendorRepo.findById(id).orElseThrow(() -> new RuntimeException("Vendor not founds for id " + id));
	}

	// disable vender
	@Transactional
	@Override
	public void disableVendor(int id) {
		// TODO Auto-generated method stub

		vendorRepo.disableVendor(id);

	}

	//list active vendors
	@Override
	public List<Vendors> getActiveVendor() {
		// TODO Auto-generated method stub
		return (List<Vendors>)vendorRepo.getActiveVendor();
	}

}
