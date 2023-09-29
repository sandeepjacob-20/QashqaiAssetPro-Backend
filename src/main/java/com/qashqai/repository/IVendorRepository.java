package com.qashqai.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qashqai.model.Vendor;

@Repository
public interface IVendorRepository extends CrudRepository<Vendor,Integer>{

}
