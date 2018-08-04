import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {MainComponent} from "../view/main/main.component";
import {DashboardComponent} from "../view/dashboard/dashboard.component";
import {GigPageComponent} from "../view/gig-page/gig-page.component";
import {UserLoginComponent} from "../view/user-login/user-login.component";
import {UserRegistationComponent} from "../view/user-registation/user-registation.component";


const appRoutes:Routes = [
  {
    path: "main",
    component:MainComponent,
    children:[
      {path:"dashboard",component:DashboardComponent},
      {path:"gig-page",component:GigPageComponent},
      {path:"user-login",component:UserLoginComponent},
      {path:"user-registation",component:UserRegistationComponent},
      {path:"",pathMatch:"full",redirectTo:"/main/dashboard"}
    ]
  },
  {path:"",pathMatch:"full",redirectTo:"/main/dashboard"}
]
@NgModule({
  imports: [
   RouterModule.forRoot(appRoutes)
  ],
 exports:[
   RouterModule
 ]
})
export class RoutingModule { }
