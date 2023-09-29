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
import com.qashqai.model.AssetDefinition;
import com.qashqai.service.IAssetDefinitionService;

@CrossOrigin
@RestController // @Controller+@Configuration
@RequestMapping("/api")
public class AssetDefinitionController {
	@Autowired
	private IAssetDefinitionService assetDefinitionService;

	@Autowired
	private APIResponse apiResponse;

	// list
	@GetMapping("/assetdefinition")
	public List<AssetDefinition> getAssetDefinition() {
		return assetDefinitionService.getAssetDefinition();
	}

	@PostMapping("/assetdefinition")
	public ResponseEntity<APIResponse> addAssetDefinition(@RequestBody AssetDefinition assetDefinition) {
		if (assetDefinitionService.saveAssetDefinition(assetDefinition) == null) {
			apiResponse.setData("Name can have only alphabets!!");
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid Name");

			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Assets added successfully");
		apiResponse.setStatus(200);

		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}

	// search by id
	@GetMapping("/assetdefinition/{id}")
	public AssetDefinition getAssetDefinitionById(@PathVariable int id) {
		return (AssetDefinition) assetDefinitionService.getAssetDefinitionById(id);
	}

	// deactivate
	// to deactivate isActive
	@GetMapping("/assetdefinition/deactivate/{id}")
	public void deactivateAssetDefintion(@PathVariable int id) {
		assetDefinitionService.deactivateAssetDefinition(id);
	}
}

