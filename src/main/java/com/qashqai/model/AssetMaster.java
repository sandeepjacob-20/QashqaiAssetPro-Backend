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
	@Column(name = "assetmasterid")
	private Integer id;

	// mapping
	@Column(name="assetMasterType")
	private Integer vendorId;

	@ManyToOne
	@JoinColumn(name = "vendorId", insertable = false, updatable = false)
	private Vendors vendor;

	private String assetMake;
	
	@Column(name="AssetMasterModel")
	// mapping
	private Integer adId; // for storing the model

	@ManyToOne
	@JoinColumn(name = "adId", insertable = false, updatable = false)
	private AssetDefinition assetdefinition;

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
	
	@Column(name="isTaken")
	private boolean isTaken = true;

	// record creation date
	@Column(name = "dateCreated", nullable = true)
	private LocalDate dateCreated = LocalDate.now();

	// record modification date
	@Column(name = "dateModified", nullable = true)
	private LocalDate dateModified = LocalDate.now();

	public AssetMaster() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public Vendors getVendor() {
		return vendor;
	}

	public void setVendor(Vendors vendor) {
		this.vendor = vendor;
	}

	public String getAssetMake() {
		return assetMake;
	}

	public void setAssetMake(String assetMake) {
		this.assetMake = assetMake;
	}

	public Integer getAdId() {
		return adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public AssetDefinition getAssetdefinition() {
		return assetdefinition;
	}

	public void setAssetdefinition(AssetDefinition assetdefinition) {
		this.assetdefinition = assetdefinition;
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

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDate getDateModified() {
		return dateModified;
	}

	public void setDateModified(LocalDate dateModified) {
		this.dateModified = dateModified;
	};
	
	

}
