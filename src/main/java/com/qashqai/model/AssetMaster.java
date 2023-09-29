/*package com.qashqai.model;

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
	private Integer vendorId;

	@OneToOne
	@JoinColumn(name = "vendorId", insertable = false, updatable = false)
	private Vendors vendor;

	private String assetMake;

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
	private LocalDate dateModified = LocalDate.now();;

}*/
