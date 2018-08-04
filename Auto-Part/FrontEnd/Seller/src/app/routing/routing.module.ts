import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {MainComponent} from "../view/main/main.component";
import {DashboardComponent} from "../view/dashboard/dashboard.component";
import {ManageGigsComponent} from "../view/manage-gigs/manage-gigs.component";
import {PaymentsComponent} from "../view/payments/payments.component";
import {LoginGuard} from "../guards/login.guard";
import {LoginComponent} from "../view/login/login.component";

const appRouter:Routes=[
  {
  path:"main",component:MainComponent,
    canActivate:[LoginGuard],
    children:[
      {path:"dashboard",component:DashboardComponent},
      {path:"manage-gigs",component:ManageGigsComponent},
      {path:"payments",component:PaymentsComponent},
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
