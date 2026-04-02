import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Header } from './components/header/header';
import { Main } from './components/main/main';
import { Footer } from './components/footer/footer';
import { Directives } from './components/directives/directives';
import { Logout } from './components/logout/logout';
import { CommonModule } from '@angular/common';
import { List } from './components/list/list';
import { Add } from './components/add/add';
import { Update } from './components/update/update';

@Component({
  selector: 'app-root',
  imports: [Update,Add,List,CommonModule,Directives,Header,Main,Footer,Logout,RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('student-management-app');
  showLogin=true
  // names=["Gaurav","Rajjo","Mayank"]
}
