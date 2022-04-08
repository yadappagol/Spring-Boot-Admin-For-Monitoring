package com.example.demoadminclient.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCompanyDto implements Serializable{

	private String companyName;
	private String status;

}
