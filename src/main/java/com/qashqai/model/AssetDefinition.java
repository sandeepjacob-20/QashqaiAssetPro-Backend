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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adId")
	private Integer adId;

	@Column(name = "adName", nullable = false, length = 60)
	private String adName;

	@Column(name = "adClass", nullable = false, length = 60)
	private String adClass;

	// mapping
	private Integer assetType;

	@ManyToOne
	@JoinColumn(name = "assetId", insertable = false, updatable = false)
	private Asset asset;

	public AssetDefinition() {
	}

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

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	@Override
	public String toString() {
		return "AssetDefinition [adId=" + adId + ", adName=" + adName + ", adClass=" + adClass + ", assetType="
				+ assetType + ", asset=" + asset + "]";
	}
	
}
