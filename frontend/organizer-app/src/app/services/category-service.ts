import { inject, Service } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from '../interfaces/category';
import { HttpClient } from '@angular/common/http';

@Service()
export class CategoryService {
  http: HttpClient = inject(HttpClient);
  apiUrl = '/api/categories';

  getAllCategories(): Observable<Category[]> {
    return this.http.get<Category[]>(this.apiUrl);
  }

  getCategoryById(id: number): Observable<Category> | undefined {
    return this.http.get<Category>(this.apiUrl + `/${id}`);
  }
}
