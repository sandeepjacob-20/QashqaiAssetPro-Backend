package com.qashqai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qashqai.common.APIResponse;
import com.qashqai.model.AssetClass;
import com.qashqai.service.IAssetClassService;

@CrossOrigin
@RestController // @Controller+@Configuration
@RequestMapping("/api")
public class AssetClassController {
	@Autowired
	private IAssetClassService assetClassService;

	@Autowired
	private APIResponse apiResponse;

	// list
	@GetMapping("/assetclass")
	public List<AssetClass> getAssetClass() {
		return (List<AssetClass>) assetClassService.getAssetClass();
	}

	@PostMapping("/assetclass")
	public ResponseEntity<APIResponse> addAssetClass(@RequestBody AssetClass assetClass) {
		if (assetClassService.saveAssetClass(assetClass) == null) {
			apiResponse.setData("Name can have only alphabets!!");
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid Name");

			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Assets added successfully");
		apiResponse.setStatus(200);

		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}

}
