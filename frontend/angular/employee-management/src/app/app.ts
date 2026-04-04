import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UserManagement } from './components/user-management/user-management';
import { User } from './models/user';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,UserManagement,CommonModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('employee-management');
  name="gaurav";
  show=true;
  usersList: User[] =[
      {uid: 1,uname: "gaurav",email: "gaurav@mail.com",role: "admin"},
      {uid: 2,uname: "mayank",email: "mayank@mail.com",role: "admin"},
      {uid: 3,uname: "rajjo",email: "rajjo@mail.com",role: "admin"},
      {uid: 4,uname: "mohit",email: "mohit@mail.com",role: "user"},
    ]

  addToUserList(user:any){
    this.usersList.push(user);
  }

  // changeName(name:string){
  //   this.name=name;
  // }

}
