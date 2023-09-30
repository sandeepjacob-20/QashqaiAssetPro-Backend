package com.qashqai.service;

import java.util.List;

import com.qashqai.model.Asset;
import com.qashqai.model.AssetDefinition;

public interface IAssetDefinitionService {


	   //list of assets
		public List<AssetDefinition> getAssetDefinition();
		
	    //insert
		public AssetDefinition saveAssetDefinition(AssetDefinition assetDefinition);
		
		//deactivate
		public void deactivateAssetDefinition(int id);
		
		//update
		public void updateAssetDefinition(int id,String adName,int assetId,String adClass);
		
		//search by id
		public List<AssetDefinition> getAssetDefinitionById(int id);

	   
}
