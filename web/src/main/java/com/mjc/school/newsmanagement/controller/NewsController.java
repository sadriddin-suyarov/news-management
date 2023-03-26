package com.mjc.school.newsmanagement.controller;

import com.mjc.school.newsmanagement.dto.*;
import com.mjc.school.newsmanagement.service.NewsService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/news")
@RequiredArgsConstructor
public class NewsController {
    private final NewsService newsService;

    @GetMapping
    public List<NewsDto> getAll(@Valid NewsSearchParams searchParams, @RequestParam(defaultValue = "Created|DESC") SortBy sortBy) {
        return newsService.getAll(searchParams, sortBy);
    }

    @GetMapping("/{newsId}")
    public NewsDto getById(@PathVariable Long newsId, @RequestParam(defaultValue = "Created|DESC") SortBy sortBy) {
        return newsService.getById(newsId, sortBy);
    }

    @PostMapping
    public NewsDto create(@RequestBody NewsDto newsDto) {
        return newsService.create(newsDto);
    }

    @PutMapping("/{newsId}")
    public NewsDto update(@PathVariable Long newsId, @RequestBody NewsDto newsDto) {
        return newsService.update(newsId, newsDto);
    }

    @DeleteMapping("/{newsId}")
    public NewsDto delete(@PathVariable Long newsId) {
        return newsService.delete(newsId);
    }

    @GetMapping("/{newsId}/comments")
    public List<CommentDto> getCommentsByNewsId(@PathVariable Long newsId) {
        return newsService.getCommentsByNewsId(newsId);
    }

    @GetMapping("/{newsId}/tags")
    public List<TagDto> getTagsByNewsId(@PathVariable Long newsId) {
        return newsService.getTagsByNewsId(newsId);
    }

    @GetMapping("/{newsId}/authors")
    public AuthorDto getAuthorByNewsId(@PathVariable Long newsId) {
        return newsService.getAuthorByNewsId(newsId);
    }
}
