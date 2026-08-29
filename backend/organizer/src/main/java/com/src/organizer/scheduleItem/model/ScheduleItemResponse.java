package com.src.organizer.scheduleItem.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.src.organizer.category.model.CategoryResponse;

import java.time.LocalDate;
import java.time.LocalTime;

public record ScheduleItemResponse (
        Long id,
        String name,
        CategoryResponse category,
        LocalDate date,
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm")
        LocalTime startTime,
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm")
        LocalTime endTime
) {}
