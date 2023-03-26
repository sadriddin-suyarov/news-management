package com.mjc.school.newsmanagement.config;

import com.mjc.school.newsmanagement.dto.SortBy;
import org.springframework.core.convert.converter.Converter;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class StringParamConverter implements Converter<String, SortBy> {
    @Override
    public SortBy convert(String source) {
        try {
            return Arrays.stream(SortBy.values())
                    .filter(sortBy -> sortBy.getValue().equalsIgnoreCase(source))
                    .findAny()
                    .get();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}
