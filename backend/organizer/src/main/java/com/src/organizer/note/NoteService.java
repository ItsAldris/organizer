package com.src.organizer.note;

import com.src.organizer.note.model.NoteResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;
    private final NoteMapper noteMapper;

    public NoteResponse getNoteById(Long id) {
        Note note = noteRepository.findById(id).orElseThrow();
        return noteMapper.toResponse(note);
    }

    public List<NoteResponse> getAllNotes() {
        List<Note> notes = noteRepository.findAll();
        return noteMapper.toResponse(notes);
    }
}
