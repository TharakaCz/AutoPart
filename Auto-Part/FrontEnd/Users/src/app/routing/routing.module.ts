import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";

import {DashbordComponent} from "../view/dashbord/dashbord.component";
import {GigPageComponent} from "../view/gig-page/gig-page.component";



const appRoutes: Routes = [
  {path:"dashbord", component: DashbordComponent},
  {path:"", pathMatch:"full", redirectTo:"dashbord"},
  {path:"gig-page",component:GigPageComponent}
]
@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class RoutingModule { }
