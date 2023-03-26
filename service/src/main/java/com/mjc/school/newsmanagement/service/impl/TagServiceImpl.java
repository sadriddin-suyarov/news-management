package com.mjc.school.newsmanagement.service.impl;

import com.mjc.school.newsmanagement.dto.SortBy;
import com.mjc.school.newsmanagement.dto.TagDto;
import com.mjc.school.newsmanagement.service.TagService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Override
    public List<TagDto> getAll(String namePart, SortBy sortBy) {
        return null;
    }

    @Override
    public TagDto getById(Long tagId, SortBy sortBy) {
        return null;
    }

    @Override
    public TagDto create(TagDto authorDto) {
        return null;
    }

    @Override
    public TagDto update(Long tagId, TagDto authorDto) {
        return null;
    }

    @Override
    public TagDto delete(Long tagId) {
        return null;
    }
}
