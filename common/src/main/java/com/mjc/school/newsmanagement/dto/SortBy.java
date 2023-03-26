package com.mjc.school.newsmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SortBy {
    CREATED_ASC("Created|ASC"),
    CREATED_DESC("Created|DESC"),
    MODIFIED_ASC("Modified|ASC"),
    MODIFIED_DESC("Modified|DESC");

    private final String value;
}
