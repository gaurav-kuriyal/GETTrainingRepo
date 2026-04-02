import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-main',
  imports: [FormsModule],
  templateUrl: './main.html',
  styleUrl: './main.css',
})
export class Main {
  username="";
  password="";
  // router=Router;
  constructor(private router:Router){

  }
  login(){
    if(this.username==="gaurav" && this.password ==="gaurav@123"){
      alert("Logged In Successfully");
      this.router.navigate(["/list"]);
    }else{
      alert("Invalid Credentials");
    }
  }
}
