import { AfterViewChecked, AfterViewInit, Component, DoCheck, EventEmitter, Input, OnChanges, OnDestroy, OnInit, Output, SimpleChanges } from '@angular/core';
import { User } from '../../models/user';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user-management',
  imports: [CommonModule],
  templateUrl: './user-management.html',
  styleUrl: './user-management.css',
})
export class UserManagement implements OnInit, OnChanges,DoCheck,AfterViewInit,AfterViewChecked,OnDestroy {
  @Input() usersList : User[] =[]
  @Input() name:any;
  @Input() myname:any;
  @Output() addUserEvent = new EventEmitter<any>();
  @Output() changeUserEvent = new EventEmitter<any>();
  constructor(){
    console.log("1. Constructor Called")
    // this.listUsers(); 
  }
  
  ngOnDestroy(): void {
    console.log('7 ngOnDestroy Called');
  }
  ngAfterViewChecked(): void {
    console.log('6 ngAfterViewChecked Called');
  }
  ngAfterViewInit(): void {
    console.log('5 ngAfterViewInit Called');
  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log('2 ngOnChanges Called: ',changes);
  }
  ngDoCheck(): void {
    console.log('4 ngDoCheck Called');
  }
  ngOnInit(): void {
    console.log("3. ngOnInit Called")
  }

  // listUsers(){
  //   this.userList = [
  //     {uid: 1,uname: "gaurav",email: "gaurav@mail.com",role: "admin"},
  //     {uid: 2,uname: "mayank",email: "mayank@mail.com",role: "admin"},
  //     {uid: 3,uname: "rajjo",email: "rajjo@mail.com",role: "admin"},
  //     {uid: 4,uname: "mohit",email: "mohit@mail.com",role: "user"},
  //   ]
  // }

  changeName(){
    // name = "Hello"
    this.changeUserEvent.emit("hello");
  }
  addUser(){
    const user = {uid: 5,uname: "avinash",email: "avinash@mail.com",role: "admin"};
    this.addUserEvent.emit(user);
  }
}
