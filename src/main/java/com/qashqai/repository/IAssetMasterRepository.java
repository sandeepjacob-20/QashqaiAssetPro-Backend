package com.qashqai.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qashqai.model.AssetMaster;

@Repository
public interface IAssetMasterRepository extends CrudRepository<AssetMaster, Integer>{

}
