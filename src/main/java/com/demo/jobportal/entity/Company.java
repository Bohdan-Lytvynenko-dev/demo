package com.demo.jobportal.entity;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;


@Entity
@Table(name = "COMPANIES")
public class Company
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;

	@Column(name = "NAME", nullable = false, unique = true)
	private String name;

	@Column(name = "LOGO", length = 500)
	private String logo;

	@Column(name = "INDUSTRY", nullable = false, length = 100)
	private String industry;

	@Column(name = "SIZE", nullable = false, length = 50)
	private String size;

	@Column(name = "RATING", nullable = false, precision = 3, scale = 2)
	private BigDecimal rating;

	@Column(name = "LOCATIONS", length = 1000)
	private String locations;

	@Column(name = "FOUNDED", nullable = false)
	private Integer founded;

	@Lob
	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "EMPLOYEES")
	private Integer employees;

	@Column(name = "WEBSITE", length = 500)
	private String website;

	@Column(name = "CREATED_AT", nullable = false)
	private Instant createdAt;

	@Column(name = "CREATED_BY", nullable = false, length = 20)
	private String createdBy;

	@Column(name = "UPDATED_AT")
	private Instant updatedAt;

	@Column(name = "UPDATED_BY", length = 20)
	private String updatedBy;

	public Long getId()
	{
		return id;
	}

	public void setId(final Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getLogo()
	{
		return logo;
	}

	public void setLogo(final String logo)
	{
		this.logo = logo;
	}

	public String getIndustry()
	{
		return industry;
	}

	public void setIndustry(final String industry)
	{
		this.industry = industry;
	}

	public String getSize()
	{
		return size;
	}

	public void setSize(final String size)
	{
		this.size = size;
	}

	public BigDecimal getRating()
	{
		return rating;
	}

	public void setRating(final BigDecimal rating)
	{
		this.rating = rating;
	}

	public String getLocations()
	{
		return locations;
	}

	public void setLocations(final String locations)
	{
		this.locations = locations;
	}

	public Integer getFounded()
	{
		return founded;
	}

	public void setFounded(final Integer founded)
	{
		this.founded = founded;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

	public Integer getEmployees()
	{
		return employees;
	}

	public void setEmployees(final Integer employees)
	{
		this.employees = employees;
	}

	public String getWebsite()
	{
		return website;
	}

	public void setWebsite(final String website)
	{
		this.website = website;
	}

	public Instant getCreatedAt()
	{
		return createdAt;
	}

	public void setCreatedAt(final Instant createdAt)
	{
		this.createdAt = createdAt;
	}

	public String getCreatedBy()
	{
		return createdBy;
	}

	public void setCreatedBy(final String createdBy)
	{
		this.createdBy = createdBy;
	}

	public Instant getUpdatedAt()
	{
		return updatedAt;
	}

	public void setUpdatedAt(final Instant updatedAt)
	{
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy()
	{
		return updatedBy;
	}

	public void setUpdatedBy(final String updatedBy)
	{
		this.updatedBy = updatedBy;
	}
}
