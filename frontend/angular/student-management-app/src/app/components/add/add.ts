import { Component } from '@angular/core';
import { Student } from '../../models/student';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-add',
  imports: [FormsModule,CommonModule],
  templateUrl: './add.html',
  styleUrl: './add.css',
})
export class Add {
  student: Student = new Student(0,"","");
  studentList: Student[] = [];
  addStudent(){
    this.studentList.push(this.student);
    console.log(this.studentList)
  }
}
