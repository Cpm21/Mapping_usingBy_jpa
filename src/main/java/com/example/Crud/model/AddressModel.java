package com.example.Crud.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Address")
public class AddressModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	private String addressType;
	private String city;
	
	//@OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
	// @JoinColumn(name = "product_id")
	//private ProductModel productModel;

	
	public AddressModel() {
		super();
	}


	public AddressModel(Long addressId, String addressType, String city) {
		this.addressId = addressId;
		this.addressType = addressType;
		this.city = city;
	}


	public Long getAddressId() {
		return addressId;
	}


	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}


	public String getAddressType() {
		return addressType;
	}


	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setProductModel(ProductModel productModel) {
		// TODO Auto-generated method stub
		
	}


//	public ProductModel getProductModel() {
//		return productModel;
//	}
//
//
//	public void setProductModel(ProductModel productModel) {
//		this.productModel = productModel;
//	}
	
	
	
}
