import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Hotel } from '../../models/hotel';

@Component({
  selector: 'app-update',
  imports: [ReactiveFormsModule,CommonModule,FormsModule],
  templateUrl: './update.html',
  styleUrl: './update.css',
})
export class Update implements OnInit {

  constructor(private fb:FormBuilder){}

  toBeUpdateHotel!: Hotel;
  hotelForm !: FormGroup; 
  hotelList: Hotel[]=[
    new Hotel(1,"Hotel Gachibowli",878744374,"Gachibowli, Telangana"),
    new Hotel(2,"Hotel Ghaziabad",99889988,"Ghaziabad, UP"),
    new Hotel(3,"Hotel Lucknow",99889978,"Lucknow, UP"),
  ];
  ngOnInit(): void {
    this.hotelForm = this.fb.group({
      id:[''],
      name:['',[Validators.required,Validators.minLength(3)]],
      contact:['',[Validators.required,Validators.minLength(3)]],
      address:['',[Validators.required,Validators.minLength(1)]],
      openForBooking:[false],
    })
  }

  getHotelById(hotelId:string){
    const id = Number(hotelId)
    const hotel = this.hotelList.find(h=>h.id===id);
    console.log(id)
    if(hotel){
      this.toBeUpdateHotel = hotel;
      console.log(hotel)
      this.hotelForm.patchValue(this.toBeUpdateHotel);
    }
    else{
      alert("Hotel not found");
    }
  }


  updateHotel(){
    console.log(this.hotelForm.value)
    const hotel = this.hotelForm.value;
    const index = this.hotelList.findIndex(h=>h.id === hotel.id);
    this.hotelList[index] = {...hotel};
    console.log(this.hotelList); 
  }
}
