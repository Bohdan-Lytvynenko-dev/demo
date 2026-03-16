package com.demo.jobportal.company.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.demo.jobportal.dto.CompanyDto;
import com.demo.jobportal.entity.Company;
import com.demo.jobportal.repository.CompanyRepository;
import com.demo.jobportal.company.service.CompanyService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService
{

	private final CompanyRepository companyRepository;

	@Override
	public List<CompanyDto> getAllCompanies()
	{
		List<Company> companyList = companyRepository.findAll();
		return companyList.stream().map(this::transformToDto).collect(Collectors.toList());
	}

	private CompanyDto transformToDto(Company company)
	{
		return new CompanyDto(company.getId(), company.getName(), company.getLogo(), company.getIndustry(), company.getSize(),
				company.getRating(), company.getLocations(), company.getFounded(), company.getDescription(), company.getEmployees(),
				company.getWebsite(), company.getCreatedAt());
	}
}