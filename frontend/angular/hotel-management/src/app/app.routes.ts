import { Routes } from '@angular/router';
import { Login } from './components/login/login';
import { View } from './components/view/view';
import { Add } from './components/add/add';
import { Update } from './components/update/update';
import { Signup } from './signup/signup';

export const routes: Routes = [
    {path:"login",component:Login},
    {path:"signup",component:Signup},
    {path:"view",component:View},
    {path:"add",component:Add},
    {path:"update",component:Update}
];
