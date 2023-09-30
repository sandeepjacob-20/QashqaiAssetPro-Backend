package com.qashqai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asset {
    //Asset Id
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="assetId")
	private Integer assetId;
	
	//Asset Type
	@Column(name="assetType", nullable=false, length=60)
	private String assetType;
	
	//isActive
	@Column(name="isActive")
	private boolean isActive;
	
	
	//default Constructor
	public Asset() {
		
	}
	
	//getters and setters
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	//Tostring
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", assetType=" + assetType + ", isActive=" + isActive + "]";
	}

	

}
