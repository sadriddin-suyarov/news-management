package com.mjc.school.newsmanagement.dto;

import lombok.Data;

import java.util.List;

@Data
public class NewsSearchParams {
    private List<Long> tagIds;
    private List<String> tagNames;
    private String authorName;
    private String titlePart;
    private String contentPart;
}
