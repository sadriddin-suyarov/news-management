package com.mjc.school.newsmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tblComment")
public class Comment {
    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    private String content;

    @OneToOne
    private News news;

    @Column(nullable = false)
    private LocalDateTime created;

    @Column(nullable = false)
    private LocalDateTime modified;
}
