package com.src.organizer.category;

import com.src.organizer.category.model.CategoryRequest;
import com.src.organizer.category.model.CategoryResponse;
import org.mapstruct.*;

import java.util.List;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CategoryMapper {

    CategoryResponse toResponse(Category category);

    List<CategoryResponse> toResponse(List<Category> categories);

    Category toEntity(CategoryRequest categoryRequest);

    Category toEntity(Long id);
}
