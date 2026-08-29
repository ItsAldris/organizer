package com.src.organizer.task;

import com.src.organizer.category.CategoryMapper;
import com.src.organizer.task.model.TaskRequest;
import com.src.organizer.task.model.TaskResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {CategoryMapper.class}
)
public interface TaskMapper {

    TaskResponse toResponse(Task task);

    List<TaskResponse> toResponse(List<Task> tasks);

    Task toEntity(TaskRequest taskRequest);

    Task toEntity(Long id);
}
