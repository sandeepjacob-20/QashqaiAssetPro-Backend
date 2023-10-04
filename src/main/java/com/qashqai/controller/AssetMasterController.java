package com.qashqai.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qashqai.common.APIResponse;
import com.qashqai.model.AssetMaster;
import com.qashqai.service.IAssetMasterService;
import com.qashqai.util.JwtUtil;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AssetMasterController {

	@Autowired
	private APIResponse apiResponse;
	
	@Autowired 
	private IAssetMasterService assetMasterService;
	@Autowired
	private JwtUtil jwtutil;
	@GetMapping("/listassets")
	public List<AssetMaster> getAssets(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		return assetMasterService.getAllActiveEntries();
	}
	
	@PostMapping("/addassets")
	public ResponseEntity<APIResponse> addAssetMaster(@RequestBody AssetMaster asset,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
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
	public Optional<AssetMaster> getAsset(@PathVariable int id,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		return assetMasterService.searchAsset(id);
	}
	
	//deactivate or delete asset
	@GetMapping("/deleteasset/{id}")
	public void disableAssets(@PathVariable int id,@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException
			{ //get value passed bu postman
		jwtutil.verifyAdmin(auth);
		assetMasterService.disableAssets(id);
	}
}
