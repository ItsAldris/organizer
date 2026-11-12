import { AsyncPipe } from '@angular/common';
import { Component, effect, inject } from '@angular/core';
import { NoteService } from '../services/note-service';
import { Observable } from 'rxjs';
import { Note } from '../interfaces/note';

@Component({
  selector: 'app-notes',
  imports: [AsyncPipe],
  templateUrl: './notes.html',
  styleUrl: './notes.scss',
})
export class Notes {
  noteService : NoteService = inject(NoteService);

  noteList$! : Observable<Note[]>;

  constructor() {
    effect(() => {
      this.noteList$ = this.noteService.getAllNotes();
    })
  }
}
