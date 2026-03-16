package com.demo.jobportal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "CONTACTS")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CREATED_AT", nullable = false)
    private Instant createdAt;

    @Column(name = "CREATED_BY", nullable = false, length = 20)
    private String createdBy;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Lob
    @Column(name = "MESSAGE", nullable = false)
    private String message;

    @Column(name = "NAME", nullable = false)
    private String name;

    @ColumnDefault("'NEW'")
    @Column(name = "STATUS", nullable = false, length = 20)
    private String status;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "UPDATED_AT")
    private Instant updatedAt;

    @Column(name = "UPDATED_BY", length = 20)
    private String updatedBy;

    @Column(name = "USER_TYPE", nullable = false, length = 50)
    private String userType;

}