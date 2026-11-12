import { Category } from "./category";

export interface Task {
    id: number,
    name: string,
    date: string,
    category: Category,
    completed: boolean
}
