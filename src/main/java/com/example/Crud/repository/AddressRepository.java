package com.example.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Crud.model.AddressModel;

public interface AddressRepository extends JpaRepository<AddressModel, Long> {

}
