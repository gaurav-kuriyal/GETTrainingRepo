import { Component, OnInit } from '@angular/core';
import { Student } from '../../models/student';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { StudentService } from '../../services/student-service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-update',
  imports: [ReactiveFormsModule,CommonModule,FormsModule],
  templateUrl: './update.html',
  styleUrl: './update.css',
})
export class Update implements OnInit {

  constructor(private fb:FormBuilder,private service: StudentService,private route : ActivatedRoute){}

  toBeUpdateStudent!: Student;
  studentForm !: FormGroup; 
  studentList: Student[]=[]
  ngOnInit(): void {
    this.studentForm = this.fb.group({
      id:[''],
      sname:['',[Validators.required,Validators.minLength(3)]],
      course:['',[Validators.required,Validators.minLength(1)]]
    })
    const studentId = this.route.snapshot.paramMap.get("id");
    if(studentId){
      this.service.getStudentById(studentId).subscribe(data=>{
      this.toBeUpdateStudent=new Student(data.id,data.sname,data.course);
      this.studentForm.patchValue(this.toBeUpdateStudent);
      })
    }
  }

  getStudentById(studentId:string){
    const sid = Number(studentId)
    // const stud = this.studentList.find(s=>s.id===sid);
    // if(stud){
    //   this.toBeUpdateStudent = stud;
    //   console.log(stud)
    //   this.studentForm.patchValue(this.toBeUpdateStudent);
    // }
    // else{
    //   alert("Student not found");
    // }
    this.service.getStudentById(studentId).subscribe(data=>{
      console.log(data);
      this.toBeUpdateStudent=new Student(data.id,data.sname,data.course);
      this.studentForm.patchValue(this.toBeUpdateStudent);
      console.log(this.toBeUpdateStudent);
    })
    console.log(this.toBeUpdateStudent);
  }


  updateStudent(){
    console.log(this.studentForm.value)
    const stud = this.studentForm.value;
    this.service.updateStudentById(stud.id,new Student(stud.id,stud.sname,stud.course)).subscribe(data=>{
      console.log(data);
    });
    // const index = this.studentList.findIndex(s=>s.id === stud.sid);
    // this.studentList[index] = {...stud};
    // console.log(this.studentList); 
  }
}
