package com.qashqai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assetdefinition")
public class AssetDefinition {
	//id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adId")
	private Integer adId;

	//asset Name
	@Column(name = "adName", nullable = false, length = 60)
	private String adName;

	//asset class
	@Column(name = "adClass", nullable = false, length = 60)
	private String adClass;

	// mapping
	private Integer assetClassId;

	@ManyToOne
	@JoinColumn(name = "assetClassId", insertable = false, updatable = false)
	private Asset assetClass;
	
	// mapping
		private Integer assetId;
@ManyToOne
		@JoinColumn(name = "assetId", insertable = false, updatable = false)
		private Asset assetTypes;

	
	//isActive
	private boolean isActive=true;
	
	//Default Constructor
	public AssetDefinition() {
	}
	
	//getters and setters
	public Integer getAdId() {
		return adId;
	}
	public void setAdId(Integer adId) {
		this.adId = adId;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdClass() {
		return adClass;
	}
	public void setAdClass(String adClass) {
		this.adClass = adClass;
	}
	public Integer getAssetId() {
		return assetId;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
		
	}
	
	public Asset getAssetTypes() {
		return assetTypes;
	}

	public void setAssetTypes(Asset assetTypes) {
		this.assetTypes = assetTypes;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	//tostring
	@Override
	public String toString() {
		return "AssetDefinition [adId=" + adId + ", adName=" + adName + ", adClass=" + adClass + ", assetId=" + assetId
				+ ", assetTypes=" + assetTypes + ", isActive=" + isActive + "]";
	}

	
	
	}
	

