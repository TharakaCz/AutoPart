import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DashboardComponent } from './view/dashboard/dashboard.component';
import { ManageSellersComponent } from './view/manage-sellers/manage-sellers.component';
import { ManageSellersAccountComponent } from './view/manage-sellers-account/manage-sellers-account.component';
import {RoutingModule} from "./routing/routing.module";


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    ManageSellersComponent,
    ManageSellersAccountComponent

  ],
  imports: [
    BrowserModule,
    RoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
