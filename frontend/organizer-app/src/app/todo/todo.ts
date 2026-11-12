import { Component, effect } from '@angular/core';
import { inject } from '@angular/core';
import { TaskService } from '../services/task-service';
import { Task } from '../interfaces/task';
import { Category } from '../interfaces/category';
import { CategoryService } from '../services/category-service';
import { AsyncPipe } from '@angular/common';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-todo',
  imports: [AsyncPipe],
  templateUrl: './todo.html',
  styleUrl: './todo.scss',
})
export class Todo {
  taskService : TaskService = inject(TaskService);
  categoryService : CategoryService = inject(CategoryService);

  taskList$! : Observable<Task[]>
  categoryList$! : Observable<Category[]>;
  testTask$!: Observable<Task> | undefined;

  constructor() {
    effect(() => {
      this.categoryList$ = this.categoryService.getAllCategories();
      this.taskList$ = this.taskService.getAllTasks();
      this.testTask$ = this.taskService.getTaskById(1);
    })
  }
}
