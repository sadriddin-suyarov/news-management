package com.mjc.school.newsmanagement.repository;

import com.mjc.school.newsmanagement.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}
