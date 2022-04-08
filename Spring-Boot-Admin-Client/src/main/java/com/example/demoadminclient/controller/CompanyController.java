package com.example.demoadminclient.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoadminclient.dto.AddCompanyDto;
import com.example.demoadminclient.entity.Company;
import com.example.demoadminclient.response.ResponseMessage;
import com.example.demoadminclient.service.CompanyService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@PostMapping("/addCompany")
	public ResponseEntity<ResponseMessage> addCompany(@RequestBody AddCompanyDto addCompanyDto) {
		Company company = companyService.addCompany(addCompanyDto);
		ResponseMessage responseMessage = new ResponseMessage(HttpStatus.OK.value(), new Date(), false,
				"Company details..", company);
		return new ResponseEntity<>(responseMessage, HttpStatus.OK);
	}

	@GetMapping("/getAllCompanies")
	public ResponseEntity<ResponseMessage> getAllCompanies() {
		List<Company> companies = companyService.getAllCompanies();
		ResponseMessage responseMessage = new ResponseMessage(HttpStatus.OK.value(), new Date(), false,
				"All Company details..", companies);
		return new ResponseEntity<>(responseMessage, HttpStatus.OK);
	}

	@GetMapping("/getCompanyById/{id}")
	public ResponseEntity<ResponseMessage> getById(@PathVariable("id") Long companyId) {
		log.debug(" >> CompanyController :  {} call : ", companyId);
		Company company = companyService.getCompanyById(companyId);
		ResponseMessage responseMessage = new ResponseMessage(HttpStatus.OK.value(), new Date(), false,
				"The Company details.. are as follows..", company);
		return new ResponseEntity<>(responseMessage, HttpStatus.OK);
	}

}
