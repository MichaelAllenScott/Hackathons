import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {
  userName = '';
  password = '';
  doctorName = 'PeterFrampton';
  showErrorMessage = false;

  constructor(private userService: UserService, private router: Router) { }

  ngOnInit() {
  }

  signIn() {
    this.showErrorMessage = false;
    if (this.userName && this.password) {
      if (this.userName === 'PeterFrampton' ) {
        this.userService.setUserName('Peter Frampton');
        this.userService.setUserType('doctor');
        this.userService.setUserId('1');
        this.userService.setUserLoggedIn(true);
      } else if (this.userName === 'steve123' ) {
        this.userService.setUserName('Steve Harris');
        this.userService.setUserType('patient');
        this.userService.setUserId('1');
        this.userService.setUserLoggedIn(true);
      } else {
        this.unrecognizedUser();
      }
    } else {
      this.unrecognizedUser();
    }
  }

  unrecognizedUser() {
    this.showErrorMessage = true;
  }
}
