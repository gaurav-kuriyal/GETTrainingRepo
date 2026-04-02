import { Component } from '@angular/core';

@Component({
  selector: 'app-databinding',
  imports: [],
  templateUrl: './databinding.html',
  styleUrl: './databinding.css',
})
export class Databinding {
  name="Gaurav Kuriyal";
  color="brown";
  isActive=false;
  url="assets/images/coforge.png";
  customBorder="3px";
  count=0;
  // changeColor=changeColor;
  changeColor(){
    this.color="red";
  }

  increaseCount(){
    this.count++;
  }
}


// function changeColor(event: MouseEvent){
//   const element = event.target as HTMLElement;
//   element.style.color="blue";
// }