package com.qashqai.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qashqai.common.APIResponse;
import com.qashqai.model.AssetMaster;
import com.qashqai.service.IAssetMasterService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AssetMasterController {

	@Autowired
	private APIResponse apiResponse;
	
	@Autowired 
	private IAssetMasterService assetMasterService;
	
	@GetMapping("/listassets")
	public List<AssetMaster> getAssets(){
		return assetMasterService.getAll();
	}
	
	@PostMapping("/addasset")
	public ResponseEntity<APIResponse> addAssetMaster(@RequestBody AssetMaster asset){
		if(assetMasterService.addAsset(asset)==null) {
			apiResponse.setData("Error adding asset");
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid Data Entry");
			
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Data Entered successfully");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}
	
	//search by id
	@GetMapping("/assetmaster/{id}")
	public Optional<AssetMaster> getAsset(@PathVariable int id) {
		return assetMasterService.searchAsset(id);
	}
	
	//deactivate or delete asset
	@GetMapping("/deleteasset/{id}")
	public void disableAssets(@PathVariable int id) {
		assetMasterService.disableAssets(id);
	}
}
