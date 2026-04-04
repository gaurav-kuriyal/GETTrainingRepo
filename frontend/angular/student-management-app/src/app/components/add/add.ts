import { Component } from '@angular/core';
import { Student } from '../../models/student';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { StudentService } from '../../services/student-service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add',
  imports: [FormsModule,CommonModule],
  templateUrl: './add.html',
  styleUrl: './add.css',
})
export class Add {
  student: Student = new Student("","","");
  studentList: Student[] = [];
  constructor(private service:StudentService,private router:Router){}
  addStudent(){
    // this.studentList.push(this.student);
    // console.log(this.studentList)
    console.log(this.student)
    this.service.addStudent(this.student).subscribe(data=>console.log(data));
    this.router.navigate(["/list"]);
  }
}
