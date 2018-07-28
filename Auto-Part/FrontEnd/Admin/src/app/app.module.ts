import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DashboardComponent } from './view/dashboard/dashboard.component';
import { ManageSellersComponent } from './view/manage-sellers/manage-sellers.component';
import { ManageSellersAccountComponent } from './view/manage-sellers-account/manage-sellers-account.component';
import {RoutingModule} from "./routing/routing.module";
import {SellerService} from "./services/seller.service";
import {NgxPaginationModule} from "ngx-pagination";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    ManageSellersComponent,
    ManageSellersAccountComponent

  ],
  imports: [
    BrowserModule,
    RoutingModule,
    HttpClientModule,
    FormsModule,
    NgxPaginationModule
  ],
  providers: [
    SellerService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
