import { Component, OnInit } from '@angular/core';
import { Student } from '../../models/student';
import { StudentService } from '../../services/student-service';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-list',
  imports: [RouterLink,CommonModule],
  templateUrl: './list.html',
  styleUrl: './list.css',
})
export class List implements OnInit{
  studentsList : Student[]=[];
  // studentsList : Student[]=[new Student(1,"Gaurav","C++"),
  //   new Student(2,"Rajjo","Python"),
  //   new Student(3,"Mayank","Java"),
  // ];

  constructor(private service:StudentService){}

  ngOnInit(): void {
    this.service.getAllStudents().subscribe(data=>{
      this.studentsList = data;
    });
    // this.studentsList = 
    console.log(this.studentsList);
  }

  getAllStudents(){
    this.service.getAllStudents().subscribe(data=>{
      this.studentsList = data;
    });
  }

  deleteStudent(sid:string){
    // this.studentsList = this.studentsList.filter(s=>s.id!=sid);
    this.service.deleteStudentById(sid).subscribe((data)=>{
      console.log("deleted")
      console.log(data);
      // console.log(error);
      this.getAllStudents();
    });
  }
}
