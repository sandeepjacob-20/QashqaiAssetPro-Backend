package com.qashqai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qashqai.model.Asset;
import com.qashqai.model.AssetDefinition;
import com.qashqai.repository.IAssetDefinitionRepository;

@Service
public class AssetDefinitionService implements IAssetDefinitionService {
	
	@Autowired
	private IAssetDefinitionRepository assetDefinitionRepo;

	@Override
	public List<AssetDefinition> getAssetDefinition() {
		
			return (List<AssetDefinition>)assetDefinitionRepo.findAll();
		}
	

	@Override
	public AssetDefinition saveAssetDefinition(AssetDefinition assetDefinition) {
		return assetDefinitionRepo.save(assetDefinition);
	}

	@Override
	public void deactivateAssetDefinition(int id) {
		assetDefinitionRepo.deactivateAssetDefinition(id);
		
	}

	@Override
	public List<AssetDefinition> getAssetDefinitionById(int id) {
		return assetDefinitionRepo.findById(id);
	}

	
			

}

