package com.mjc.school.newsmanagement.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CommentDto {
    private Long id;
    private String content;
    private NewsDto news;
    private LocalDateTime created;
    private LocalDateTime modified;
}
