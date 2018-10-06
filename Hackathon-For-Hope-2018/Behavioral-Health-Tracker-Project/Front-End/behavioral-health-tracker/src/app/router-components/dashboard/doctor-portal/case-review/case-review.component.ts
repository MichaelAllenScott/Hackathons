import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-case-review',
  templateUrl: './case-review.component.html',
  styleUrls: ['./case-review.component.css']
})
export class CaseReviewComponent implements OnInit {
  ratings = ['1', '2', '3', '4', '5', '6', ' 7', '8', '9', '10'];
  activeCircleNumbers = ['4', '7', '2'];
  commentArray = ['', '', 'I felt great today, better than usual for some reason.'];
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
        comment: 'I felt great today, better than usual for some reason.'
      },
    ]
  };

  constructor() { }

  ngOnInit() {
  }

}
