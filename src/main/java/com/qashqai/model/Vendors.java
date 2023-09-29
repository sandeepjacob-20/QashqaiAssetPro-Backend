/*package com.qashqai.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

@Entity
public class Vendors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vendorId")
    private Integer vendorId;

    @Column(name = "vendorName", nullable = false, length = 60)
    private String vendorName;

    @Column(name = "vendorType", nullable = false, length = 60)
    private String vendorType;
    
    //mapping
    private Integer assetType;
    
    @ManyToMany
    @JoinTable(
        name = "VendorAsset",
        joinColumns = @JoinColumn(name = "vendorId"),
        inverseJoinColumns = @JoinColumn(name = "assetId")
    )
    private List<Asset> assets;
    
    @Column(name = "validFrom")
    private LocalDate dteValidFrom;

    @Column(name = "validTo")
    private LocalDate dteValidTo;

    @Column(name = "address", nullable = false, length = 60)
    private String address;

    @Column(name = "isActive")
    private boolean isActive = true;

    @Column(name = "dteCreatedAt")
    private LocalDate dteCreatedAt;

    @Column(name = "dteModifiedAt")
    private LocalDate dteModifiedAt;

}*/
