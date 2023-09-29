package com.qashqai.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qashqai.model.Vendors;

@Repository
public interface IVendorRepository extends CrudRepository<Vendors,Integer>{

}
