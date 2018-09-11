import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {MainComponent} from "../view/main/main.component";
import {DashboardComponent} from "../view/dashboard/dashboard.component";
import {ManageGigsComponent} from "../view/manage-gigs/manage-gigs.component";
import {PaymentsComponent} from "../view/payments/payments.component";
import {LoginGuard} from "../guards/login.guard";
import {LoginComponent} from "../view/login/login.component";
import {ProfileComponent} from "../view/profile/profile.component";
import {DiliversComponent} from "../view/dilivers/dilivers.component";
import {PakagesComponent} from "../view/pakages/pakages.component";

const appRouter:Routes=[
  {
  path:"main",component:MainComponent,
    canActivate:[LoginGuard],
    children:[
      {path:"dashboard",component:DashboardComponent},
      {path:"manage-gigs",component:ManageGigsComponent},
      {path:"profile",component:ProfileComponent},
      {path:"payments",component:PaymentsComponent},
      {path:"pakages",component:PakagesComponent},
      {path:"dilivers",component:DiliversComponent},
      {path:"",pathMatch:"full",redirectTo:"/main/dashboard"}
    ],
  },
  {path:"login",component:LoginComponent},
  {path:"",pathMatch:"full",redirectTo:"/main/dashboard"}
]
@NgModule({
  imports: [
    RouterModule.forRoot(appRouter)
  ],
  exports: [
    RouterModule
  ]
})
export class RoutingModule { }
