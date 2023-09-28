package com.qashqai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
}
