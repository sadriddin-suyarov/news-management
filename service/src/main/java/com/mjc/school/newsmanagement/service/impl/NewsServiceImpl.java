package com.mjc.school.newsmanagement.service.impl;

import com.mjc.school.newsmanagement.dto.*;
import com.mjc.school.newsmanagement.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Override
    public List<NewsDto> getAll(NewsSearchParams searchParams, SortBy sortBy) {
        return null;
    }

    @Override
    public NewsDto getById(Long newsId, SortBy sortBy) {
        return null;
    }

    @Override
    public NewsDto create(NewsDto newsDto) {
        return null;
    }

    @Override
    public NewsDto update(Long newsId, NewsDto newsDto) {
        return null;
    }

    @Override
    public NewsDto delete(Long newsId) {
        return null;
    }

    @Override
    public List<CommentDto> getCommentsByNewsId(Long newsId) {
        return null;
    }

    @Override
    public List<TagDto> getTagsByNewsId(Long newsId) {
        return null;
    }

    @Override
    public AuthorDto getAuthorByNewsId(Long newsId) {
        return null;
    }
}
