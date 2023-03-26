package com.mjc.school.newsmanagement.service;

import com.mjc.school.newsmanagement.dto.AuthorDto;
import com.mjc.school.newsmanagement.dto.SortBy;

import java.util.List;

public interface AuthorService {
    List<AuthorDto> getAll(String namePart, SortBy sortBy);

    AuthorDto getById(Long authorId, SortBy sortBy);

    AuthorDto create(AuthorDto authorDto);

    AuthorDto update(Long authorId, AuthorDto authorDto);

    AuthorDto delete(Long authorId);
}
