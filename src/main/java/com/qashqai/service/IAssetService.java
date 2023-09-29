package com.qashqai.service;

import java.util.List;
import java.util.Optional;

import com.qashqai.model.Asset;
import com.qashqai.model.AssetDefinition;
import com.qashqai.model.AssetMaster;


public interface IAssetService {

	   //list of assets
		public List<Asset> getAsset();
		
	    //insert
		public Asset saveAsset(Asset asset);
		
		//deactivate
		public void deactivateAsset(int id);
		
		//search by id
		public Asset  getAssetById(int id);

}
