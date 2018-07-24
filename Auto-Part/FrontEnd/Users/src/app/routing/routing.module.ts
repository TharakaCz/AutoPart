import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {MainComponent} from "../view/main/main.component";
import {DashbordComponent} from "../view/dashbord/dashbord.component";
import {GigPageComponent} from "../view/gig-page/gig-page.component";



const appRoutes: Routes = [
  {
    path:"main",
    component: MainComponent,
    children:[
      {
        path:"dashbord",
        component:DashbordComponent,
      },
      {
        path:"gig-page",
        component:GigPageComponent,
      },
      {
        path:"",
        pathMatch:"full",
        redirectTo:"/main/dashbord"
      }
    ]
  },
  {
    path:"",
    pathMatch:"full",
    redirectTo:"/main/dashbord"
  }
]
@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class RoutingModule { }
