package com.mjc.school.newsmanagement.repository;

import com.mjc.school.newsmanagement.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
