package com.qashqai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.qashqai.model.AssetDefinition;


public interface IAssetDefinitionRepository extends CrudRepository<AssetDefinition, Integer> {
	
	//search by id
	//create custom method using JPQL query
		@Query("from AssetDefinition WHERE adId like %?1%")
		public List<AssetDefinition> findById(int id);
		
		//to deactivate employees
				@Modifying
				@Query("UPDATE com.qashqai.model.AssetDefinition SET isActive=0 WHERE id=?1")
				public void deactivateAssetDefinition(int id);

}
