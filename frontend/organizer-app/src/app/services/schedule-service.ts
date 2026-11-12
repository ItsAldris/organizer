import { inject, Service } from '@angular/core';
import { ScheduleItem } from '../interfaces/schedule-item';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Service()
export class ScheduleService {
  http: HttpClient = inject(HttpClient);
  apiUrl = '/api/schedule_items';

  getAllScheduledTasks(): Observable<ScheduleItem[]> {
    return this.http.get<ScheduleItem[]>(this.apiUrl);
  }

  getScheduledTaskById(id: number): Observable<ScheduleItem> | undefined {
    return this.http.get<ScheduleItem>(this.apiUrl + `/${id}`);
  }
}
