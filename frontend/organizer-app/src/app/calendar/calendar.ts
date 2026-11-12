import { AsyncPipe } from '@angular/common';
import { Component, effect, inject } from '@angular/core';
import { ScheduleService } from '../services/schedule-service';
import { Observable } from 'rxjs';
import { ScheduleItem } from '../interfaces/schedule-item';

@Component({
  selector: 'app-calendar',
  imports: [AsyncPipe],
  templateUrl: './calendar.html',
  styleUrl: './calendar.scss',
})
export class Calendar {
  scheduleService : ScheduleService = inject(ScheduleService);

  scheduleList$! : Observable<ScheduleItem[]>;

  constructor() {
    effect(() => {
      this.scheduleList$ = this.scheduleService.getAllScheduledTasks();
    })
  }
}
