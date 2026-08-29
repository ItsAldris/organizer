package com.src.organizer.note;

import com.src.organizer.category.CategoryMapper;
import com.src.organizer.note.model.NoteRequest;
import com.src.organizer.note.model.NoteResponse;
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
public interface NoteMapper {

    NoteResponse toResponse(Note note);

    List<NoteResponse> toResponse(List<Note> notes);

    Note toEntity(NoteRequest noteRequest);

    Note toEntity(Long id);
}
