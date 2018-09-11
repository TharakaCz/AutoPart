import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {MainComponent} from "../view/main/main.component";
import {AdminGuard} from "../guards/admin.guard";
import {DashboardComponent} from "../view/dashboard/dashboard.component";
import {ManageSellersComponent} from "../view/manage-sellers/manage-sellers.component";
import {ManageSellersAccountComponent} from "../view/manage-sellers-account/manage-sellers-account.component";
import {ManageGigsComponent} from "../view/manage-gigs/manage-gigs.component";
import {LoginComponent} from "../view/login/login.component";
import {ManagePakagesComponent} from "../view/manage-pakages/manage-pakages.component";

const appRoutes: Routes = [
  {
    path:"main",
    component:MainComponent,
    canActivate:[AdminGuard],
    children:[
      {path:"dashboard",component:DashboardComponent,},
      {path:"manage-sellers",component:ManageSellersComponent},
      {path:"manage-sellers-account",component:ManageSellersAccountComponent},
      {path:"manage-gigs",component:ManageGigsComponent},
      {path:"manage-pakages",component:ManagePakagesComponent},
      {path:"",pathMatch:"full",redirectTo:"/main/dashboard"}
    ]
  },
  {path:"login",component:LoginComponent},
  {path:"",pathMatch:"full",redirectTo:"/main/dashboard"}
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
