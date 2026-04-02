import { Component } from '@angular/core';
import { Student } from '../../models/student';
import { NgForOf } from '@angular/common';
// import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-list',
  imports: [NgForOf],
  templateUrl: './list.html',
  styleUrl: './list.css',
})
export class List {
  studentsList : Student[]=[new Student(1,"Gaurav","C++"),
    new Student(2,"Rajjo","Python"),
    new Student(3,"Mayank","Java"),
  ];

  deleteStudent(sid:number){
    this.studentsList = this.studentsList.filter(s=>s.sid!=sid);
  }
}
