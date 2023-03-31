package com.mjc.school.newsmanagement.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
public class NewsDto {
    private Long id;
    private String title;
    private String content;
    private AuthorDto author;
    private List<TagDto> tags;
    private LocalDateTime created;
    private LocalDateTime modified;
}
