package com.src.organizer.note.model;

import com.src.organizer.category.model.CategoryResponse;
import lombok.Builder;

@Builder
public record NoteResponse (
        Long id,
        String title,
        String content,
        CategoryResponse category
) {}
