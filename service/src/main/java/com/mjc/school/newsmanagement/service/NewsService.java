package com.mjc.school.newsmanagement.service;

import com.mjc.school.newsmanagement.dto.*;

import java.util.List;

public interface NewsService {
    List<NewsDto> getAll(NewsSearchParams searchParams, SortBy sortBy);

    NewsDto getById(Long newsId, SortBy sortBy);

    NewsDto create(NewsDto newsDto);

    NewsDto update(Long newsId, NewsDto newsDto);

    NewsDto delete(Long newsId);

    List<CommentDto> getCommentsByNewsId(Long newsId);

    List<TagDto> getTagsByNewsId(Long newsId);

    AuthorDto getAuthorByNewsId(Long newsId);
}
