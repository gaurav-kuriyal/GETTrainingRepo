import { Component } from '@angular/core';
import { Hotel } from '../../models/hotel';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-add',
  imports: [FormsModule,CommonModule],
  templateUrl: './add.html',
  styleUrl: './add.css',
})
export class Add {
  hotel: Hotel = new Hotel(0,"",0,"");
  hotelList: Hotel[] = [];
  constructor(private router:Router){

  }
  addHotel(){
    this.hotelList.push(this.hotel);
    alert("Hotel Added");
    this.router.navigate(["/view"]);
  }
}
