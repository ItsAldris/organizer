import { Category } from "./category";

export interface ScheduleItem {
    id: number,
    name: string,
    category: Category,
    date: string,
    startTime: string,
    endTime: string
}
