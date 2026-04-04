import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {
  email:string="";
  password:string="";

  constructor(private router:Router){

  }

  login(){
    
    if(this.email==="gaurav@mail.com" && this.password ==="gaurav@123"){
      alert("Logged In Successfully");
      this.router.navigate(["/view"]);
    }else{
      alert("Invalid Credentials");
    }
  }
}
