import { Routes } from '@angular/router';
import { Main } from './components/main/main';
import { Add } from './components/add/add';
import { Update } from './components/update/update';
import { List } from './components/list/list';
import { Info } from './components/info/info';

export const routes: Routes = [
    {path:'login',component:Main},
    {path:'add',component:Add},
    {path:'list',component:List},
    {path:'info/:id',component:Info},
    // {path:'update',component:Update},
    {path:'update/:id',component:Update},
];
