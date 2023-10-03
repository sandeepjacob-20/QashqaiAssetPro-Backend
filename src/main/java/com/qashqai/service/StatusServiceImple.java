package com.qashqai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qashqai.model.PurchaseStatus;
import com.qashqai.repository.IStatusRepository;
@Service

public class StatusServiceImple implements IStatusService {
	@Autowired
	private IStatusRepository StatusRepo;
	@Override
	public List<PurchaseStatus> getAll() {
		return (List<PurchaseStatus>) StatusRepo.findAll();
		}

}
