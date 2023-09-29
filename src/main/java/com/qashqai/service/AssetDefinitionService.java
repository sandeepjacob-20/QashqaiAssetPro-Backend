package com.qashqai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qashqai.model.AssetDefinition;
import com.qashqai.repository.IAssetDefinitionRepository;

@Service
public class AssetDefinitionService implements IAssetDefinitionService {
	
	@Autowired
	private IAssetDefinitionRepository assetDefinitionRepo;

	//List
	@Override
	public List<AssetDefinition> getAssetDefinition() {
		
			return (List<AssetDefinition>)assetDefinitionRepo.findAll();
		}
	
      //insert
	@Override
	public AssetDefinition saveAssetDefinition(AssetDefinition assetDefinition) {
		return assetDefinitionRepo.save(assetDefinition);
	}

	//deactivate
	@Override
	public void deactivateAssetDefinition(int id) {
		assetDefinitionRepo.deactivateAssetDefinition(id);
		
	}

	//get asset by id
	@Override
	public List<AssetDefinition> getAssetDefinitionById(int id) {
		return (List<AssetDefinition>) assetDefinitionRepo.findById(id);
	}

	//update
	@Override
	public void updateAssetDefinition(int id,String adName,int assetId,String adClass) {
		assetDefinitionRepo.updateAssetDefinition(id,adName,assetId,adClass);
	}
	
	
			

}

