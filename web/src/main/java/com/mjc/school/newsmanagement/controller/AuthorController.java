package com.mjc.school.newsmanagement.controller;

import com.mjc.school.newsmanagement.dto.AuthorDto;
import com.mjc.school.newsmanagement.dto.SortBy;
import com.mjc.school.newsmanagement.service.AuthorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping
    public List<AuthorDto> getAll(@RequestParam String namePart, @RequestParam(defaultValue = "Created|DESC") SortBy sortBy) {
        return authorService.getAll(namePart, sortBy);
    }

    @GetMapping("/{authorId}")
    public AuthorDto getById(@PathVariable Long authorId, @RequestParam(defaultValue = "Created|DESC") SortBy sortBy) {
        return authorService.getById(authorId, sortBy);
    }

    @PostMapping
    public AuthorDto create(@RequestBody AuthorDto authorDto) {
        return authorService.create(authorDto);
    }

    @PutMapping("/{authorId}")
    public AuthorDto update(@PathVariable Long authorId, @RequestBody AuthorDto authorDto) {
        return authorService.update(authorId, authorDto);
    }

    @DeleteMapping("/{authorId}")
    public AuthorDto delete(@PathVariable Long authorId) {
        return authorService.delete(authorId);
    }

}
