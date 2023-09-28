package com.qashqai.service;

import java.util.List;
import java.util.Optional;

import com.qashqai.model.AssetMaster;

public interface IAssetMasterService {
	//list
	public List<AssetMaster> getAll();
	
	//insert
	public AssetMaster addAsset(AssetMaster asset);
	
	//search by id
	public Optional<AssetMaster> searchAsset(int assetmasterid);
	
	//deactivate assets
	public void disableAssets(int assetmasterid);
	
}
