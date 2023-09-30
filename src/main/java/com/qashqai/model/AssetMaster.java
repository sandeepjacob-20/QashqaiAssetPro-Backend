package com.qashqai.model;

import java.sql.Date;
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
@Table(name = "assetmaster")
public class AssetMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer amId;

	// mapping
	private Integer amTypeId;

	@OneToOne
	@JoinColumn(name = "assetId", insertable = false, updatable = false)
	private Asset asset;

	// mapping
	private Integer vendorId; // for storing the vendor details

	@OneToOne
	@JoinColumn(name = "vendorId", insertable = false, updatable = false)
	private Vendors vendors;

	// mapping
	private Integer adId; // for storing the make info

	@OneToOne
	@JoinColumn(name = "adId", insertable = false, updatable = false)
	private AssetDefinition assetDefinition;
	
	@Column(name = "model", nullable = false)
	private String model;

	@Column(name = "serialNumber", nullable = false)
	private Integer serialNumber;

	@Column(name = "yearOfManifacture", nullable = false)
	private Date yearOfManifacture;

	@Column(name = "purchaseDate", nullable = false)
	private Date purchaseDate;

	@Column(name = "warranty", nullable = false)
	private char warranty;

	@Column(name = "warrantyFrom", nullable = false)
	private Date warrantyFrom;

	@Column(name = "warrantyTo", nullable = false)
	private Date warrantyTo;

	@Column(name = "isTaken")
	private boolean isTaken = true;


	public AssetMaster() {
	}


	public Integer getAmId() {
		return amId;
	}


	public void setAmId(Integer amId) {
		this.amId = amId;
	}


	public Integer getAmTypeId() {
		return amTypeId;
	}


	public void setAmTypeId(Integer amTypeId) {
		this.amTypeId = amTypeId;
	}


	public Asset getAsset() {
		return asset;
	}


	public void setAsset(Asset asset) {
		this.asset = asset;
	}


	public Integer getVendorId() {
		return vendorId;
	}


	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}


	public Vendors getVendors() {
		return vendors;
	}


	public void setVendors(Vendors vendors) {
		this.vendors = vendors;
	}


	public Integer getAdId() {
		return adId;
	}


	public void setAdId(Integer adId) {
		this.adId = adId;
	}


	public AssetDefinition getAssetDefinition() {
		return assetDefinition;
	}


	public void setAssetDefinition(AssetDefinition assetDefinition) {
		this.assetDefinition = assetDefinition;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Integer getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}


	public Date getYearOfManifacture() {
		return yearOfManifacture;
	}


	public void setYearOfManifacture(Date yearOfManifacture) {
		this.yearOfManifacture = yearOfManifacture;
	}


	public Date getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public char getWarranty() {
		return warranty;
	}


	public void setWarranty(char warranty) {
		this.warranty = warranty;
	}


	public Date getWarrantyFrom() {
		return warrantyFrom;
	}


	public void setWarrantyFrom(Date warrantyFrom) {
		this.warrantyFrom = warrantyFrom;
	}


	public Date getWarrantyTo() {
		return warrantyTo;
	}


	public void setWarrantyTo(Date warrantyTo) {
		this.warrantyTo = warrantyTo;
	}


	public boolean isTaken() {
		return isTaken;
	}


	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}

	
}
