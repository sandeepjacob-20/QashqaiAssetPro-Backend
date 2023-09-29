package com.qashqai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qashqai.model.Asset;

@Repository
public interface IAssetRepository  extends CrudRepository<Asset, Integer> {
	
	//search by id
	//create custom method using JPQL query
		@Query("from Asset WHERE assetId like %?1%")
		public List<Asset> findById(int id);
		
		//to deactivate employees
				@Modifying
				@Query("UPDATE com.qashqai.model.Asset SET isActive=1 WHERE id=?1")
				public void deactivateAsset(int id);

}
