import { inject, Service } from '@angular/core';
import { Note } from '../interfaces/note';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Service()
export class NoteService {
  http: HttpClient = inject(HttpClient);
  apiUrl = '/api/notes';

  getAllNotes(): Observable<Note[]> {
    return this.http.get<Note[]>(this.apiUrl);
  }

  getNoteById(id: number): Observable<Note> | undefined {
    return this.http.get<Note>(this.apiUrl + `/${id}`);
  }
}
