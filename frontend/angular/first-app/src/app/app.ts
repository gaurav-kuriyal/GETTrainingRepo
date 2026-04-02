import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Databinding } from './components/databinding/databinding';

@Component({
  selector: 'app-root',
  // imports: [RouterOutlet,Databinding],
  imports: [Databinding],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('first-app');
  // protected readonly title = 'first-app';
  myname="Gaurav Kuriyal";
  textStyle="text-primary";
}
