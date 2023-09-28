package com.qashqai.controller;

import java.util.List;

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
import com.qashqai.model.Asset;
import com.qashqai.model.AssetDefinition;
import com.qashqai.service.IAssetService;

@CrossOrigin
@RestController //@Controller+@Configuration
@RequestMapping("/api")
public class AssetController {
	@Autowired
	private IAssetService assetService;
	
	@Autowired
	private APIResponse apiResponse;
	    //list
		@GetMapping("/asset")
		public List<Asset> getAsset(){
			return assetService.getAsset(); 
		}
		
		
		@PostMapping("/asset")
		public ResponseEntity<APIResponse> addAssetDefinition(@RequestBody Asset asset){
			if(assetService.saveAsset(asset)==null) {
					apiResponse.setData("Name can have only alphabets!!");
					apiResponse.setStatus(500);
					apiResponse.setError("Invalid Name");
					
					return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
			}
			apiResponse.setData("Assets added successfully");
			apiResponse.setStatus(200);
			
			return ResponseEntity
					.status(apiResponse.getStatus()).body(apiResponse);
			
		}
		//search by id
		@GetMapping("/asset/{id}")
		public Asset getAssetById(@PathVariable int id) {
			return assetService.getAssetById(id);
		}
		
		//deactivate
		//to deactivate isActive
				@GetMapping("/asset/deactivate/{id}")
				public void deactivate(@PathVariable int id) {
					assetService.deactivateAsset(id);
				}
}
