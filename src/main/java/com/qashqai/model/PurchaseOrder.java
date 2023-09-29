package com.qashqai.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
public class PurchaseOrder {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pdId")
	private Integer pdId;

	@Column(name = "pdOrder ", nullable = false, length = 60)
	private Integer pdOrder;
	
	@Column(name = "pdQty ")
	private Integer pdQty;
	
	@Column(name = "pdDate ", nullable = false, length = 60)
	private LocalDate pdDate;
	
	@Column(name = "pdDdate ", nullable = false, length = 60)
	private LocalDate pdDdate;
	
	@Column(name = "pdStatus  ", nullable = false, length = 60)
	private String pdStatus;
	
	private boolean isTaken=true;
	//mapping
	
	private Integer pdVendor;
	@ManyToOne
	@JoinColumn(name="vendorId",insertable=false,updatable=false)
	private Vendors vendor;
	
	private Integer pdType;
	@ManyToOne
	@JoinColumn(name="assetId",insertable=false,updatable=false)
	private Asset asset;
	
	public PurchaseOrder() {
	
	}
	public Integer getPdId() {
		return pdId;
	}
	public void setPdId(Integer pdId) {
		this.pdId = pdId;
	}
	public int getPdOrder() {
		return pdOrder;
	}
	public void setPdOrder(int pdOrder) {
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
	public LocalDate getPdDdate() {
		return pdDdate;
	}
	public void setPdDdate(LocalDate pdDdate) {
		this.pdDdate = pdDdate;
	}
	public String getPdStatus() {
		return pdStatus;
	}
	public void setPdStatus(String pdStatus) {
		this.pdStatus = pdStatus;
	}
	public boolean isTaken() {
		return isTaken;
	}
	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}
	public Integer getPdVendor() {
		return pdVendor;
	}
	public void setPdVendor(Integer pdVendor) {
		this.pdVendor = pdVendor;
	}
	public Vendors getVendor() {
		return vendor;
	}
	public void setVendor(Vendors vendor) {
		this.vendor = vendor;
	}
	public Integer getPdType() {
		return pdType;
	}
	public void setPdType(Integer pdType) {
		this.pdType = pdType;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [pdId=" + pdId + ", pdOrder=" + pdOrder + ", pdQty=" + pdQty + ", pdDate=" + pdDate
				+ ", pdDdate=" + pdDdate + ", pdStatus=" + pdStatus + ", isTaken=" + isTaken + ", pdVendor=" + pdVendor
				+ ", vendor=" + vendor + ", pdType=" + pdType + ", asset=" + asset + "]";
	}
		
}
