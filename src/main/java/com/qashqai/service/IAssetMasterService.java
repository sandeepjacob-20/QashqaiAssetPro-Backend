package com.qashqai.service;

import java.util.List;

import com.qashqai.model.AssetMaster;

public interface IAssetMasterService {
	//list
	public List<AssetMaster> getAll();
	
	//insert
	public AssetMaster addAsset(AssetMaster asset);
	
	//search by id
	public AssetMaster searchAsset(int assetmasterid);
	
}
