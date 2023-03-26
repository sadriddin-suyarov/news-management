package com.mjc.school.newsmanagement.service.impl;

import com.mjc.school.newsmanagement.dto.AuthorDto;
import com.mjc.school.newsmanagement.dto.SortBy;
import com.mjc.school.newsmanagement.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Override
    public List<AuthorDto> getAll(String namePart, SortBy sortBy) {
        return null;
    }

    @Override
    public AuthorDto getById(Long authorId, SortBy sortBy) {
        return null;
    }

    @Override
    public AuthorDto create(AuthorDto authorDto) {
        return null;
    }

    @Override
    public AuthorDto update(Long authorId, AuthorDto authorDto) {
        return null;
    }

    @Override
    public AuthorDto delete(Long authorId) {
        return null;
    }
}
