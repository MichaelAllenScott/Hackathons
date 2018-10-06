import { Routes } from '@angular/router';
import { DashboardComponent } from './router-components/dashboard/dashboard.component';
import { CaseReviewComponent } from './router-components/dashboard/doctor-portal/case-review/case-review.component';

export const routes: Routes = [
    { path: '', redirectTo: '/home', pathMatch: 'full' },
    { path: '*', redirectTo: '/home'},
    { path: 'home', component: DashboardComponent},
    { path: 'case/1', component: CaseReviewComponent }
];
