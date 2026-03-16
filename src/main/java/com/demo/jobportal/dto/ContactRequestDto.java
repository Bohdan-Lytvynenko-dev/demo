package com.demo.jobportal.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.demo.jobportal.entity.Contact}
 */
public record ContactRequestDto(String email, String message, String name, String subject,
                                String userType) implements Serializable {
}
