package com.qashqai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qashqai.model.Asset;
import com.qashqai.model.AssetDefinition;
import com.qashqai.repository.IAssetRepository;
@Service
public class AssetService implements IAssetService {
	
	@Autowired
	private IAssetRepository assetRepo;

	@Override
	public List<Asset> getAsset() {
		return (List<Asset>)assetRepo.findAll();
	}

	//insert
	@Override
	public Asset saveAsset(Asset asset) {
		
			return assetRepo.save(asset);
	}

	@Override
	public void deactivateAsset(int id) {
		assetRepo.deactivateAsset(id);
		
	}

	@Override
	public Asset getAssetById(int id) {
		return  (Asset) assetRepo.findById(id);
	}
	
			

}
