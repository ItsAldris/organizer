package com.src.organizer.note.model;

import com.src.organizer.category.model.CategoryRequest;

public record NoteRequest (
        Long id,
        String title,
        String content,
        CategoryRequest category
) {}
