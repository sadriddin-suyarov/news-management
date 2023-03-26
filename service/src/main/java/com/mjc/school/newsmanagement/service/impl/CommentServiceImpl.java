package com.mjc.school.newsmanagement.service.impl;

import com.mjc.school.newsmanagement.dto.CommentDto;
import com.mjc.school.newsmanagement.dto.SortBy;
import com.mjc.school.newsmanagement.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Override
    public CommentDto getById(Long commentId, SortBy sortBy) {
        return null;
    }

    @Override
    public CommentDto create(CommentDto commentDto) {
        return null;
    }

    @Override
    public CommentDto update(Long commentId, CommentDto commentDto) {
        return null;
    }

    @Override
    public CommentDto delete(Long commentId) {
        return null;
    }
}
