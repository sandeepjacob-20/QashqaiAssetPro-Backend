package com.qashqai.service;

import java.util.List;
import java.util.Optional;

import com.qashqai.model.Asset;


public interface IAssetService {

	   //list of assets
		public List<Asset> getAsset();
		
	    //insert
		public Asset saveAsset(Asset asset);
		
		//deactivate
		public void deactivateAsset(int id);
		
		//search by id
		public List<Asset> getAssetById(int id);

}