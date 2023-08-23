package com.example.Crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.model.AddressModel;
import com.example.Crud.model.ProductModel;
import com.example.Crud.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public AddressModel saveAddress(AddressModel addressModel) {
		return addressRepository.save(addressModel);
	}
	
	
}
