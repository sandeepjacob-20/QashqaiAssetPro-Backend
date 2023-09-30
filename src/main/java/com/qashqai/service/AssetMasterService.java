package com.qashqai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qashqai.model.AssetMaster;
import com.qashqai.repository.IAssetMasterRepository;

@Service
public class AssetMasterService implements IAssetMasterService {
	
	@Autowired
	private IAssetMasterRepository assetMasterRepo;
	
	//list all assets
	@Override
	public List<AssetMaster> getAll() {
		return (List<AssetMaster>) assetMasterRepo.findAll();
	}

	//insert new asset
	@Override
	public AssetMaster addAsset(AssetMaster asset) {
		// TODO Auto-generated method stub
		return assetMasterRepo.save(asset);
	}
	
	//search by id
	@Override
	public Optional<AssetMaster> searchAsset(int assetmasterid) {
		// TODO Auto-generated method stub
		return assetMasterRepo.findById(assetmasterid);
	}
	
	//to delete items
	@Transactional
	@Override
	public void disableAssets(int assetmasterid) {
		// TODO Auto-generated method stub
		assetMasterRepo.disableAssets(assetmasterid);

	}

}