package com.qashqai.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qashqai.model.PurchaseStatus;
@Repository


public interface IStatusRepository extends CrudRepository<PurchaseStatus, Integer> {

}
