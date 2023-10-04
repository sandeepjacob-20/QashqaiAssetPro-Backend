package com.qashqai.service;

import java.util.List;

import com.qashqai.model.Vendors;


public interface IVendorService {
	//list
		public List<Vendors>getVendor();
		//insert
		public Vendors saveVendor(Vendors vendor);
		//search
		public Vendors getVendor(int id);
		//disable
		public void disableVendor(int id);
		//list active vendors
		public List<Vendors> getActiveVendor();
		

}
