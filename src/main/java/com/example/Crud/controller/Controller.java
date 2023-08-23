package com.example.Crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Crud.model.AddressModel;
import com.example.Crud.model.ProductModel;
import com.example.Crud.service.AddressService;
import com.example.Crud.service.ProductService;


@RestController
public class Controller {
    
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public ProductModel addProduct(@RequestBody ProductModel productModel) {
		
		
		return service.saveProduct(productModel);
	}
	
	@PostMapping("/addProducts")
	public List<ProductModel> addProducts(@RequestBody List<ProductModel> productModel){
		return service.saveAllProduct(productModel);
		
	}
	
	@GetMapping("/peoduct/{id}")
	public ProductModel addProducts(@PathVariable Long id){
		return service.getProductId(id);
		
	}
	
	@GetMapping("/peoduct/{name}")
	public ProductModel addProducts(@PathVariable String name){
		return service.getProductByName(name);
		
	}
	
	@PutMapping("/update")
	public ProductModel updateProducts(@RequestBody ProductModel productModel){
		return service.updatePrdoct(productModel);
	}
	
	@DeleteMapping("/delete{id}")
	public String updateProducts(@RequestBody Long id){
		return service.deleteProduct(id);
	}
	
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/address")
	public AddressModel addAddress(@RequestBody AddressModel addressModel) {
		return addressService.saveAddress(addressModel);
	}
	
}
