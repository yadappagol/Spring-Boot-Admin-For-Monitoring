package com.example.demoadminclient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demoadminclient.dto.AddCompanyDto;
import com.example.demoadminclient.entity.Company;
import com.example.demoadminclient.repository.CompanyRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public Company addCompany(AddCompanyDto addCompanyDto) {
		Company company = new Company();
		BeanUtils.copyProperties(addCompanyDto, company);
		return companyRepository.save(company);
	}

	@Override
	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}

	@Override
	@Cacheable("company")
	public Company getCompanyById(Long companyId) {
		log.info("This is Fetching Company data From DB For Id : {}");
		Optional<Company> company = companyRepository.findById(companyId);
		if (company.isPresent()) {
			Company company2 = companyRepository.findById(companyId).get();
			return company2;
		} else {
			return new Company();
		}
	}
}
