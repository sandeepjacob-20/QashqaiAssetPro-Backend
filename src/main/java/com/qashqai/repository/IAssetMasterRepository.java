/*package com.qashqai.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qashqai.model.AssetMaster;

@Repository
public interface IAssetMasterRepository extends CrudRepository<AssetMaster, Integer>{
	@Modifying
	@Query("UPDATE com.qashqai.model.AssetMaster SET is_taken = 1 WHERE assetmasterid=?1")
	public void disableAssets(int assetmasterid);
}*/
