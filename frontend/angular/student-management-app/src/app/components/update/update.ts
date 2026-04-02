import { Component, OnInit } from '@angular/core';
import { Student } from '../../models/student';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-update',
  imports: [ReactiveFormsModule,CommonModule,FormsModule],
  templateUrl: './update.html',
  styleUrl: './update.css',
})
export class Update implements OnInit {

  constructor(private fb:FormBuilder){}

  toBeUpdateStudent!: Student;
  studentForm !: FormGroup; 
  studentList: Student[]=[
    new Student(1,"Gaurav","C++"),
    new Student(2,"Rajjo","Python"),
    new Student(3,"Mayank","Java")
  ];
  ngOnInit(): void {
    this.studentForm = this.fb.group({
      sid:[''],
      sname:['',Validators.required,Validators.minLength(3)],
      course:['',Validators.required,Validators.minLength(1)]
    })
  }

  getStudentById(studentId:string){
    const sid = Number(studentId)
    const stud = this.studentList.find(s=>s.sid===sid);
    if(stud){
      this.toBeUpdateStudent = stud;
      console.log(stud)
      this.studentForm.patchValue(this.toBeUpdateStudent);
    }
    else{
      alert("Student not found");
    }
  }


  updateStudent(){
    console.log(this.studentForm.value)
    const stud = this.studentForm.value;
    const index = this.studentList.findIndex(s=>s.sid === stud.sid);
    this.studentList[index] = {...stud};
    console.log(this.studentList); 
  }
}
