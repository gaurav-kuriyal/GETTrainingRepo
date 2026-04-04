import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { StudentService } from '../../services/student-service';
import { ActivatedRoute } from '@angular/router';
import { Student } from '../../models/student';

@Component({
  selector: 'app-info',
  imports: [CommonModule],
  templateUrl: './info.html',
  styleUrl: './info.css',
})
export class Info implements OnInit{

  student!: Student;

  constructor(private service:StudentService,private route: ActivatedRoute){

  }

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get("id");
    if(id){
      this.service.getStudentById(id).subscribe(data=>{
        this.student = data;
      })
    }
  }

}
