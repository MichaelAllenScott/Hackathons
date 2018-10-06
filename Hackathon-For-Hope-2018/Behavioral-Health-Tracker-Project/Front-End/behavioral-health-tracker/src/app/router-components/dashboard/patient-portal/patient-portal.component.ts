import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-patient-portal',
  templateUrl: './patient-portal.component.html',
  styleUrls: ['./patient-portal.component.css']
})
export class PatientPortalComponent implements OnInit {
  ratings = ['1', '2', '3', '4', '5', '6', ' 7', '8', '9', '10'];
  activeCircleNumbers = [];
  commentArray = [];
  caseInstance = {
    caseName: 'Diabetes Treatment',
    dayNumber: '6',
    Tasks: [
      {
        description: 'How were you feeling today on a scale of 1 - 10?',
        rating: 5,
        comment: null
      },
      {
        description: 'How well did you sleep on a scale of 1- 10',
        rating: 5,
        comment: null
      },
      {
        description: 'Did you notice any side effect after you took your medication? If so, how bad?',
        rating: 5,
        comment: null
      },
    ]
  };

  constructor() { }

  ngOnInit() {
    this.setUpActiveCircles();
    this.setUpComments();
  }

  setUpActiveCircles() {
    this.activeCircleNumbers = [];
    this.caseInstance.Tasks.forEach(task => {
      this.activeCircleNumbers.push(0);
    });
  }

  setUpComments() {
    this.commentArray = [];
    this.caseInstance.Tasks.forEach(task => {
      this.commentArray.push({open: false, value: null});
    });
  }

  selectCircle(index, rating) {
    if (this.activeCircleNumbers[index] === rating) {
      this.activeCircleNumbers[index] = 0;
      return;
    }
    this.activeCircleNumbers[index] = rating;
  }

  openComment(index) {
    this.commentArray[index].open = true;
  }
}
