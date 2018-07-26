import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {DashboardComponent} from "../view/dashboard/dashboard.component";
import {ManageGigComponent} from "../view/manage-gig/manage-gig.component";


const appRoutes: Routes =[
  {path:"dashboard",component:DashboardComponent},
  {path:"",pathMatch:"full",redirectTo:"dashboard"},
  {path:"manage-gig",component:ManageGigComponent}
]
@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports:[
    RouterModule
  ]
})
export class AppRoutingModule { }
