package com.example.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Crud.model.ProductModel;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<ProductModel, Long> {

	ProductModel findByName(String name);

}
