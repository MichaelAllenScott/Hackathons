import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { UserService } from '../../../services/user.service';
import { ApiGeneral } from '../../../services/api-general.service';

@Component({
  selector: 'app-doctor-portal',
  templateUrl: './doctor-portal.component.html',
  styleUrls: ['./doctor-portal.component.css']
})
export class DoctorPortalComponent implements OnInit {
  doctorId = '1';
  patients = [];
  userName = '';
  userType = '';

  constructor(private userService: UserService, private apiService: ApiGeneral) { }

  ngOnInit() {
    this.userName = this.userService.getUserName();
    this.userType = this.userService.getUserType();

    this.apiService.getPatients(this.doctorId).subscribe(response => {
      if (response) {
        this.patients = response;
        console.log(this.patients);
      }
    });
  }

}
