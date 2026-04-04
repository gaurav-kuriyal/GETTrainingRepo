import { Component } from '@angular/core';
import { Hotel } from '../../models/hotel';
import { CommonModule } from '@angular/common';
import { RouterLink } from "@angular/router";

@Component({
  selector: 'app-view',
  imports: [CommonModule, RouterLink],
  templateUrl: './view.html',
  styleUrl: './view.css',
})
export class View {
  hotels : Hotel[] = [
    new Hotel(1,"Hotel Gachibowli",878744374,"Gachibowli, Telangana"),
    new Hotel(2,"Hotel Ghaziabad",99889988,"Ghaziabad, UP"),
    new Hotel(3,"Hotel Lucknow",99889978,"Lucknow, UP"),
  ]

  deleteHotel(id: number){
    this.hotels = this.hotels.filter(h=>h.id!=id);
  }
}
