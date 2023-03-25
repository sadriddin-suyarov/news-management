package com.mjc.school.newsmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tblAuthor", uniqueConstraints = @UniqueConstraint(name = "author_name_uk", columnNames = "name"))
public class Author {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;
}
