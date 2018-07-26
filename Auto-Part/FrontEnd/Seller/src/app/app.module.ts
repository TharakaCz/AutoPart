import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ManageGigComponent } from './view/manage-gig/manage-gig.component';
import { ManageItemsComponent } from './view/manage-items/manage-items.component';
import { PaymentsComponent } from './view/payments/payments.component';
import { ManageOrdersComponent } from './view/manage-orders/manage-orders.component';
import { MainComponent } from './view/main/main.component';
import { DashboardComponent } from './view/dashboard/dashboard.component';
import { LoginComponent } from './view/login/login.component';
 import {AppRoutingModule} from "./app-routing/app-routing.module";



@NgModule({
  declarations: [
    AppComponent,
    ManageGigComponent,
    ManageItemsComponent,
    PaymentsComponent,
    ManageOrdersComponent,
    MainComponent,
    DashboardComponent,
    LoginComponent


  ],
  imports: [
    BrowserModule,
     AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
