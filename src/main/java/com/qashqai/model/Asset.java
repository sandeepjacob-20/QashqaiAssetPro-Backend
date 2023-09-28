package com.qashqai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asset {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="assetId")
	private Integer assetId;
	
	@Column(name="assetType", nullable=false, length=60)
	private String assetType;

	public Asset() {
		
	}

	public Asset(Integer assetId, String assetType) {
		super();
		this.assetId = assetId;
		this.assetType = assetType;
	}

	
	
	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", assetType=" + assetType + "]";
	}

	
	
	
}
