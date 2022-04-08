package com.example.demoadminclient.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TableDetails")
public class Company implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long companyId;
	private String companyName;
	private String status;

}
