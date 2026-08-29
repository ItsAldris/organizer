package com.src.organizer.task.model;

import com.src.organizer.category.model.CategoryRequest;

import java.time.LocalDate;

public record TaskRequest (
        Long id,
        String name,
        LocalDate date,
        CategoryRequest category,
        Boolean completed
) {}
