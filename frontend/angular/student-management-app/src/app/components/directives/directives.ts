import { CommonModule, NgIf } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-directives',
  imports: [CommonModule],
  templateUrl: './directives.html',
  styleUrl: './directives.css',
})
export class Directives {
  isLoggedIn=false;
  students = [
    {id:1,name:"Gaurav",course:"c++"},
    {id:2,name:"Rajjo",course:"python"},
    {id:3,name:"Mayank",course:"java"},
  ]
  login(){
    this.isLoggedIn=!this.isLoggedIn;
  }
}
