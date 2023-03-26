package com.mjc.school.newsmanagement.service;

import com.mjc.school.newsmanagement.dto.SortBy;
import com.mjc.school.newsmanagement.dto.TagDto;

import java.util.List;

public interface TagService {
    List<TagDto> getAll(String namePart, SortBy sortBy);

    TagDto getById(Long tagId, SortBy sortBy);

    TagDto create(TagDto authorDto);

    TagDto update(Long tagId, TagDto authorDto);

    TagDto delete(Long tagId);
}
