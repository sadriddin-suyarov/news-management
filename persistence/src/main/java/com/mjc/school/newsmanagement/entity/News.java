package com.mjc.school.newsmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "tblNews", uniqueConstraints = @UniqueConstraint(name = "news_title_uk", columnNames = "title"))
public class News {
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @OneToOne
    private Author author;

    @OneToMany
    private List<Tag> tags;

    @Column(nullable = false)
    private LocalDateTime created;

    @Column(nullable = false)
    private LocalDateTime modified;
}
