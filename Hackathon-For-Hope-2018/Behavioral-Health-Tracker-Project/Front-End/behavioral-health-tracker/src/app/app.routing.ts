import { Routes } from '@angular/router';
import { DashboardComponent } from './router-components/dashboard/dashboard.component';

export const routes: Routes = [
    { path: '', redirectTo: '/home', pathMatch: 'full' },
    { path: '*', redirectTo: '/home'},
    { path: 'home', component: DashboardComponent}
];
