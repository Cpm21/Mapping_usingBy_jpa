package com.example.Crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Crud.model.ProductModel;
import com.example.Crud.repository.Repository;

@org.springframework.stereotype.Service
public class ProductService {

	@Autowired
	private Repository repository;
	
	public ProductModel saveProduct(ProductModel productModel) {
		return repository.save(productModel);
		
	}
	
	public List<ProductModel> saveAllProduct(List<ProductModel> productModel){
		return repository.saveAll(productModel);
		
	}
	
	
	public ProductModel getProductId(Long id){
		return repository.findById(id).orElse(null);
		
	}
	public ProductModel getProductByName(String name){
		return repository.findByName(name);
		
	}
	
	public String deleteProduct(Long id) {
		repository.deleteById(id);
		return "product removed"+id;
		
	}
	
	public ProductModel updatePrdoct(ProductModel productModel) {
		
		ProductModel modelUpdate=repository.findById(productModel.getId()).orElse(null);
		modelUpdate.setName(productModel.getName());
		modelUpdate.setQuantity(productModel.getQuantity());
		modelUpdate.setPrice(productModel.getPrice());
		
		return repository.save(modelUpdate);
		
	}
	
	
}
