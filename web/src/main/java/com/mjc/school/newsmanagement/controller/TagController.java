package com.mjc.school.newsmanagement.controller;

import com.mjc.school.newsmanagement.dto.SortBy;
import com.mjc.school.newsmanagement.dto.TagDto;
import com.mjc.school.newsmanagement.service.TagService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/tags")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;

    @GetMapping
    public List<TagDto> getAll(@RequestParam String namePart, @RequestParam(defaultValue = "Created|DESC") SortBy sortBy) {
        return tagService.getAll(namePart, sortBy);
    }

    @GetMapping("/{tagId}")
    public TagDto getById(@PathVariable Long tagId, @RequestParam(defaultValue = "Created|DESC") SortBy sortBy) {
        return tagService.getById(tagId, sortBy);
    }

    @PostMapping
    public TagDto create(@RequestBody TagDto authorDto) {
        return tagService.create(authorDto);
    }

    @PutMapping("/{tagId}")
    public TagDto update(@PathVariable Long tagId, @RequestBody TagDto authorDto) {
        return tagService.update(tagId, authorDto);
    }

    @DeleteMapping("/{tagId}")
    public TagDto delete(@PathVariable Long tagId) {
        return tagService.delete(tagId);
    }
}
