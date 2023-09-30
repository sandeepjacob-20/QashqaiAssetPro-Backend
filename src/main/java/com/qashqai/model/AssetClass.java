package com.qashqai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AssetClass {
	 //AssetClass Id
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="assetClassId")
		private Integer assetClassId;
		
		//Asset Class
		@Column(name="assetClass", nullable=false, length=60)
		private String assetClass;

		public AssetClass() {
			super();
		}


		public Integer getAssetClassId() {
			return assetClassId;
		}

		public void setAssetClassId(Integer assetClassId) {
			this.assetClassId = assetClassId;
		}

		public String getAssetClass() {
			return assetClass;
		}

		public void setAssetClass(String assetClass) {
			this.assetClass = assetClass;
		}

		@Override
		public String toString() {
			return "AssetClass [assetClassId=" + assetClassId + ", assetClass=" + assetClass + "]";
		}
		
		
		
		

}
