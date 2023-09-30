package com.qashqai.service;

import java.util.List;

import com.qashqai.model.Asset;
import com.qashqai.model.AssetClass;

public interface IAssetClassService {

	      //list of assets
			public List<AssetClass> getAssetClass();
			
		    //insert
			public AssetClass saveAssetClass(AssetClass assetClass);
			
			//deactivate
			//public void deactivateAsset(int id);
			
			//search by id
			//public List<Asset> getAssetById(int id);
}
