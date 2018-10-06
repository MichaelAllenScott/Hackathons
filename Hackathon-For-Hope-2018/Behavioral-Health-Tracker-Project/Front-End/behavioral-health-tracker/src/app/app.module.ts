import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { DashboardComponent } from './router-components/dashboard/dashboard.component';
import { routes } from './app.routing';
import { NavbarComponent } from './navbar/navbar.component';
import { PatientPortalComponent } from './router-components/dashboard/patient-portal/patient-portal.component';
import { DoctorPortalComponent } from './router-components/dashboard/doctor-portal/doctor-portal.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { UserService } from './services/user.service';


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    NavbarComponent,
    PatientPortalComponent,
    DoctorPortalComponent,
    WelcomeComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes, { useHash: false }),
  ],
  providers: [
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
