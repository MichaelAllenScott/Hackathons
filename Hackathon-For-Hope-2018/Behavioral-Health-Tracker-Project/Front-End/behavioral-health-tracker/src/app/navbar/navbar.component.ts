import { Component, OnInit } from '@angular/core';

import { UserService } from '../services/user.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  userName = '';
  userType = '';

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.userName = this.userService.getUserName();
    this.userType = this.userService.getUserType();
  }

  logout() {
    this.userService.logUserOut();
  }
}
