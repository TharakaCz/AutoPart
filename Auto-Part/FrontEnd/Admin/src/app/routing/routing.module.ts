import { NgModule } from '@angular/core';

import {RouterModule, Routes} from "@angular/router";
import {DashboardComponent} from "../view/dashboard/dashboard.component";
import {ManageSellersComponent} from "../view/manage-sellers/manage-sellers.component";
import {ManageSellersAccountComponent} from "../view/manage-sellers-account/manage-sellers-account.component";

const appRoutes : Routes=[
  {path:"dashboard",component:DashboardComponent},
  {path:"",pathMatch:"full",redirectTo:"dashboard"},
  {path:"manage-sellers",component:ManageSellersComponent},
  {path:"manage-sellers-account",component:ManageSellersAccountComponent}
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
