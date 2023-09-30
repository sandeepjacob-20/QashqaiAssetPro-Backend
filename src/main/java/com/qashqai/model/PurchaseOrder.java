package com.qashqai.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pdId")
	private Integer pdId;

	@Column(name = "pdOrder ", nullable = false, length = 60)
	private String pdOrder;
	
	@Column(name = "pdQty ")
	private Integer pdQty;
	
	@Column(name = "pdDate ", nullable = false, length = 60)
	private LocalDate pdDate;
	
	@Column(name = "pdDDate ", nullable = false, length = 60)
	private LocalDate pdDDate;
	
	
	
	public LocalDate getPdDDate() {
		return pdDDate;
	}
	public void setPdDDate(LocalDate pdDDate) {
		this.pdDDate = pdDDate;
	}
	private boolean isTaken=true;
	private boolean isActive=true;
	
	//mapping
	private Integer adId;
	@OneToOne
	@JoinColumn(name="adId",insertable=false,updatable=false)
	private AssetDefinition assetDefinition;
	
	private Integer assetId;
	@OneToOne
	@JoinColumn(name="assetId",insertable=false,updatable=false)
	private Asset asset;
	
	private Integer vendorId;
	@OneToOne
	@JoinColumn(name="vendorId",insertable=false,updatable=false)
	private Vendors vendor;
	
	private Integer statusId;
	@OneToOne
	@JoinColumn(name="statusId",insertable=false,updatable=false)
	private PurchaseStatus purchaseStatus;
	
	public PurchaseOrder() {
	}
		
	public Integer getPdId() {
		return pdId;
	}
	public void setPdId(Integer pdId) {
		this.pdId = pdId;
	}
	public String getPdOrder() {
		return pdOrder;
	}
	public void setPdOrder(String pdOrder) {
		this.pdOrder = pdOrder;
	}
	public Integer getPdQty() {
		return pdQty;
	}
	public void setPdQty(Integer pdQty) {
		this.pdQty = pdQty;
	}
	public LocalDate getPdDate() {
		return pdDate;
	}
	public void setPdDate(LocalDate pdDate) {
		this.pdDate = pdDate;
	}
	public boolean isTaken() {
		return isTaken;
	}
	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}
	public AssetDefinition getAssetDefinition() {
		return assetDefinition;
	}
	public void setAssetDefinition(AssetDefinition assetDefinition) {
		this.assetDefinition = assetDefinition;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public Vendors getVendor() {
		return vendor;
	}
	public void setVendor(Vendors vendor) {
		this.vendor = vendor;
	}
	public PurchaseStatus getPurchaseStatus() {
		return purchaseStatus;
	}
	public void setPurchaseStatus(PurchaseStatus purchaseStatus) {
		this.purchaseStatus = purchaseStatus;
	}
	public Integer getAdId() {
		return adId;
	}
	public void setAdId(Integer adId) {
		this.adId = adId;
	}
	public Integer getAssetId() {
		return assetId;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}
	public Integer getVendorId() {
		return vendorId;
	}
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	} 
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [pdId=" + pdId + ", pdOrder=" + pdOrder + ", pdQty=" + pdQty + ", pdDate=" + pdDate
				+ ", pdDDate=" + pdDDate + ", isTaken=" + isTaken + ", isActive=" + isActive + ", adId=" + adId
				+ ", assetDefinition=" + assetDefinition + ", assetId=" + assetId + ", asset=" + asset + ", vendorId="
				+ vendorId + ", vendor=" + vendor + ", statusId=" + statusId + ", purchaseStatus=" + purchaseStatus
				+ "]";
	}
	
		
}
