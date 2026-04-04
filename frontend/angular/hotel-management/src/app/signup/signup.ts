import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  imports: [FormsModule],
  templateUrl: './signup.html',
  styleUrl: './signup.css',
})
export class Signup {
  email:string="";
  password:string="";

  constructor(private router:Router){

  }

  login(){
    
      alert("Signed Up Successfully");
      this.router.navigate(["/view"]);
  }
}
