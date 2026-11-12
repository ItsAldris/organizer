import { inject, Service } from '@angular/core';
import { Task } from '../interfaces/task';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Service()
export class TaskService {
  http: HttpClient = inject(HttpClient);
  apiUrl = '/api/tasks';

  getAllTasks(): Observable<Task[]> {
    return this.http.get<Task[]>(this.apiUrl);
  }

  getTaskById(id: number): Observable<Task> | undefined {
    return this.http.get<Task>(this.apiUrl + `/${id}`);
  }
}
