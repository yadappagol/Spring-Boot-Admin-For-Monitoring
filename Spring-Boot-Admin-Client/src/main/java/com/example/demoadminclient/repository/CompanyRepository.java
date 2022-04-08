package com.example.demoadminclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoadminclient.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
