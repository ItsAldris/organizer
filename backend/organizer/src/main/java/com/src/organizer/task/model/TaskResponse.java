package com.src.organizer.task.model;

import com.src.organizer.category.model.CategoryResponse;

import java.time.LocalDate;

public record TaskResponse (
        Long id,
        String name,
        LocalDate date,
        CategoryResponse category,
        Boolean completed
) {}
