import { Routes } from '@angular/router';
import { Todo } from './todo/todo';
import { Dashboard } from './dashboard/dashboard';
import { Notes } from './notes/notes';
import { Calendar } from './calendar/calendar';

export const routes: Routes = [
    {
        path: '',
        component: Dashboard,
        title: 'Dashboard'
    },
    {
        path: 'todo',
        component: Todo,
        title: 'Todo List'
    },
    {
        path: 'notes',
        component: Notes,
        title: 'My notes'
    },
    {
        path: 'calendar',
        component: Calendar,
        title: 'Calendar'
    }
];
