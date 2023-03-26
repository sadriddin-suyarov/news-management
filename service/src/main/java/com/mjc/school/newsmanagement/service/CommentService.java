package com.mjc.school.newsmanagement.service;

import com.mjc.school.newsmanagement.dto.CommentDto;
import com.mjc.school.newsmanagement.dto.SortBy;

public interface CommentService {
    CommentDto getById(Long commentId, SortBy sortBy);

    CommentDto create(CommentDto commentDto);

    CommentDto update(Long commentId, CommentDto commentDto);

    CommentDto delete(Long commentId);
}
