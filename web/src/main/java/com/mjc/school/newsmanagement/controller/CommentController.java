package com.mjc.school.newsmanagement.controller;

import com.mjc.school.newsmanagement.dto.CommentDto;
import com.mjc.school.newsmanagement.dto.SortBy;
import com.mjc.school.newsmanagement.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping("/{commentId}")
    public CommentDto getById(@PathVariable Long commentId, @RequestParam(defaultValue = "Created|DESC") SortBy sortBy) {
        return commentService.getById(commentId, sortBy);
    }

    @PostMapping
    public CommentDto create(@RequestBody CommentDto commentDto) {
        return commentService.create(commentDto);
    }

    @PutMapping("/{commentId}")
    public CommentDto update(@PathVariable Long commentId, @RequestBody CommentDto commentDto) {
        return commentService.update(commentId, commentDto);
    }

    @DeleteMapping("/{commentId}")
    public CommentDto delete(@PathVariable Long commentId) {
        return commentService.delete(commentId);
    }
}
