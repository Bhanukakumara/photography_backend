package com.example.photography_backend.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "photos")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String url;
    private Double price;
    private Long categoryId;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private Long adminId;
}
