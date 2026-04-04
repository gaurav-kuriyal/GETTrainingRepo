import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../models/student';

const baseUrl="http://localhost:8080/students";
@Injectable({
  providedIn: 'root',
})
export class StudentService {
  constructor(private http:HttpClient){ }

  getAllStudents():Observable<any>{
    return this.http.get(baseUrl);
  }

  addStudent(student:Student):Observable<Student|any>{
    return this.http.post(baseUrl,student);
  }
  
  getStudentById(id:string):Observable<Student|any>{
    return this.http.get(baseUrl+"/"+id);
  }
  updateStudentById(id:string,student:Student):Observable<Student|any>{
    return this.http.put(baseUrl+"/"+id,student);
  }
  deleteStudentById(id:string):Observable<any>{
    return this.http.delete(baseUrl+"/"+id);
  }

}
