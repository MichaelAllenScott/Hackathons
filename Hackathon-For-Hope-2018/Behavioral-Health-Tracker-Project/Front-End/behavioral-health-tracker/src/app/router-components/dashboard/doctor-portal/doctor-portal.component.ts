import { Component, OnInit, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-doctor-portal',
  templateUrl: './doctor-portal.component.html',
  styleUrls: ['./doctor-portal.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class DoctorPortalComponent implements OnInit {
  patients = [
    {
      firstName: 'Tom',
      lastName: 'Selleck',
      GuardianFirstName: 'Angie',
      GuardianLastName: 'Selleck',
      UserName: 'tselleck',
      Password: 'Charagw',
      Cases: [
        {
          name: 'Diabetes Treatment',
          startDate: '10-02-12',
          endDate: '11-02-12'
        }
      ]
    },
    {
      firstName: 'Tam',
      lastName: 'Selleck',
      GuardianFirstName: 'Hangie',
      GuardianLastName: 'Selleck',
      UserName: 'tselleck',
      Password: 'Charagw',
      Cases: [
        {
          name: 'Cancer Treatment',
          startDate: '10-02-12',
          endDate: '11-02-12'
        }
      ]
    },
    {
      firstName: 'Tim',
      lastName: 'Selleck',
      GuardianFirstName: 'Ingy',
      GuardianLastName: 'Selleck',
      UserName: 'tselleck',
      Password: 'Charagw',
      Cases: [
        {
          name: 'Pancreates Treatment',
          startDate: '10-02-12',
          endDate: '11-02-12'
        }
      ]
    },
    {
      firstName: 'Peter',
      lastName: 'Selleck',
      GuardianFirstName: 'Sarah',
      GuardianLastName: 'Selleck',
      UserName: 'tselleck',
      Password: 'Charagw',
      Cases: [
        {
          name: 'Generic Treatment',
          startDate: '10-02-12',
          endDate: '11-02-12'
        }
      ]
    },
    {
      firstName: 'Gwen',
      lastName: 'Selleck',
      GuardianFirstName: 'Angel',
      GuardianLastName: 'Selleck',
      UserName: 'tselleck',
      Password: 'Charagw',
      Cases: [
        {
          name: 'Information Treatment',
          startDate: '10-02-12',
          endDate: '11-02-12'
        }
      ]
    },
    {
      firstName: 'Sam',
      lastName: 'Selleck',
      GuardianFirstName: 'Luis',
      GuardianLastName: 'Selleck',
      UserName: 'tselleck',
      Password: 'Charagw',
      Cases: [
        {
          name: 'Uhh Treatment',
          startDate: '10-02-12',
          endDate: '11-02-12'
        }
      ]
    },
    {
      firstName: 'Tas',
      lastName: 'Selleck',
      GuardianFirstName: 'Joan',
      GuardianLastName: 'Selleck',
      UserName: 'tselleck',
      Password: 'Charagw',
      Cases: [
        {
          name: 'Hmm Treatment',
          startDate: '10-02-12',
          endDate: '11-02-12'
        }
      ]
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
