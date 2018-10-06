import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpClientModule, HttpClient } from '@angular/common/http';

import { AppComponent } from './app.component';
import { DashboardComponent } from './router-components/dashboard/dashboard.component';
import { routes } from './app.routing';
import { NavbarComponent } from './navbar/navbar.component';
import { PatientPortalComponent } from './router-components/dashboard/patient-portal/patient-portal.component';
import { DoctorPortalComponent } from './router-components/dashboard/doctor-portal/doctor-portal.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { UserService } from './services/user.service';
import { ApiGeneral } from './services/api-general.service';
import { CaseReviewComponent } from './router-components/dashboard/doctor-portal/case-review/case-review.component';



@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    NavbarComponent,
    PatientPortalComponent,
    DoctorPortalComponent,
    WelcomeComponent,
    CaseReviewComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    NgbModule.forRoot(),
    RouterModule.forRoot(routes, { useHash: false }),
  ],
  providers: [
    UserService,
    ApiGeneral
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
