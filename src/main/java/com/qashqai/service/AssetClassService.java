package com.qashqai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qashqai.model.AssetClass;
import com.qashqai.repository.IAssetClassRepository;

@Service
public class AssetClassService implements IAssetClassService {

	
	@Autowired
	private IAssetClassRepository assetClassRepo;
	
	@Override
	public List<AssetClass> getAssetClass() {
		return (List<AssetClass>)assetClassRepo.findAll();
	}

	@Override
	public AssetClass saveAssetClass(AssetClass assetClass) {
		return assetClassRepo.save(assetClass);
	}

}
