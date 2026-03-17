package com.demo.jobportal.company.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jobportal.dto.CompanyDto;
import com.demo.jobportal.company.service.CompanyService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompanyController
{

	private final CompanyService companyService;

	@GetMapping(version = "1.0")
	public ResponseEntity<List<CompanyDto>> getAllCompanies()
	{
		List<CompanyDto> companyList = companyService.getAllCompanies();
		return ResponseEntity.ok().body(companyList);
	}

}
