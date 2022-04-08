package com.example.demoadminclient.service;

import java.util.List;

import com.example.demoadminclient.dto.AddCompanyDto;
import com.example.demoadminclient.entity.Company;

public interface CompanyService {

	Company addCompany(AddCompanyDto addCompanyDto);

	List<Company> getAllCompanies();

	Company getCompanyById(Long companyId);

}
