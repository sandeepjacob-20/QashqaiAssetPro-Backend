package com.qashqai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PurchaseStatus")
public class PurchaseStatus {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "statusId")
	private Integer statusId;
	
	@Column(name = "status", nullable = false, length = 60)
	private String status;

	public PurchaseStatus(Integer statusId, String status) {
		super();
		this.statusId = statusId;
		this.status = status;
	}

	public PurchaseStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PurchaseStatus [statusId=" + statusId + ", status=" + status + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	
}
