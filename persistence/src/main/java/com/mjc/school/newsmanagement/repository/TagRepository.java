package com.mjc.school.newsmanagement.repository;

import com.mjc.school.newsmanagement.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
