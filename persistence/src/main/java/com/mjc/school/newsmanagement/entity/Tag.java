package com.mjc.school.newsmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tblTag", uniqueConstraints = @UniqueConstraint(name = "tag_name_uk", columnNames = "name"))
public class Tag {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = false)
    private News news;
}
