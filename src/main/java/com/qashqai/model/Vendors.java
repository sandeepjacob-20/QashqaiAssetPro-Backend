package com.qashqai.model;

import java.time.LocalDate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;



@Entity
public class Vendors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vendorId")
    private Integer vendorId;

    @Column(name = "vendorName", length = 60)
    private String vendorName;

    @Column(name = "vendorType", length = 60)
    private String vendorType;
    
    //mapping
    private Integer assetId;
    
    @ManyToOne
    @JoinColumn
    (name="assetId",insertable=false,updatable=false)
    private Asset assets;
    
    @Column(name = "validFrom")
    private LocalDate dteValidFrom;

    @Column(name = "validTo")
    private LocalDate dteValidTo;

    @Column(name = "address")
    private String address;

    @Column(name = "isActive")
    private boolean isActive = true;

//    @Column(name = "dteCreatedAt")
//    private LocalDate dteCreatedAt;
//
//    @Column(name = "dteModifiedAt")
//    private LocalDate dteModifiedAt;

	public Vendors() {
	}

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorType() {
		return vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public Asset getAssets() {
		return assets;
	}

	public void setAssets(Asset assets) {
		this.assets = assets;
	}

	public LocalDate getDteValidFrom() {
		return dteValidFrom;
	}

	public void setDteValidFrom(LocalDate dteValidFrom) {
		this.dteValidFrom = dteValidFrom;
	}

	public LocalDate getDteValidTo() {
		return dteValidTo;
	}

	public void setDteValidTo(LocalDate dteValidTo) {
		this.dteValidTo = dteValidTo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

//	public LocalDate getDteCreatedAt() {
//		return dteCreatedAt;
//	}
//
//	public void setDteCreatedAt(LocalDate dteCreatedAt) {
//		this.dteCreatedAt = dteCreatedAt;
//	}
//
//	public LocalDate getDteModifiedAt() {
//		return dteModifiedAt;
//	}
//
//	public void setDteModifiedAt(LocalDate dteModifiedAt) {
//		this.dteModifiedAt = dteModifiedAt;
//	}
    
	
    

}
