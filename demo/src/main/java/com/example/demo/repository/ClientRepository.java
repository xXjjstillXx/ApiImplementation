package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ClientModel;



public interface ClientRepository extends JpaRepository <ClientModel,Long> {
    
}
    

