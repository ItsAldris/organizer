package com.src.organizer.scheduleItem;

import com.src.organizer.category.CategoryMapper;
import com.src.organizer.scheduleItem.model.ScheduleItemRequest;
import com.src.organizer.scheduleItem.model.ScheduleItemResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {CategoryMapper.class}
)
public interface ScheduleItemMapper {
    ScheduleItemResponse toResponse(ScheduleItem scheduleItem);

    List<ScheduleItemResponse> toResponse(List<ScheduleItem> scheduleItems);

    ScheduleItem toEntity(ScheduleItemRequest scheduleItemRequest);

    ScheduleItem toEntity(Long id);
}
