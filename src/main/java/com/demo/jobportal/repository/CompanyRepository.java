package com.demo.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.jobportal.entity.Company;


@Repository // Optional annotation as extends JpaRepository
public interface CompanyRepository extends JpaRepository<Company, Long>
{
}
