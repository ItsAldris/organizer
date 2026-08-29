package com.src.organizer.scheduleItem.model;

import com.src.organizer.category.model.CategoryRequest;

import java.time.LocalDate;
import java.time.LocalTime;

public record ScheduleItemRequest (
        Long id,
        String name,
        CategoryRequest category,
        LocalDate date,
        LocalTime startTime,
        LocalTime endTime
) {}