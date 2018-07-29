import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DashboardComponent } from './view/dashboard/dashboard.component';
import { ManageSellersComponent } from './view/manage-sellers/manage-sellers.component';
import { ManageSellersAccountComponent } from './view/manage-sellers-account/manage-sellers-account.component';
import { ManageGigsComponent } from './view/manage-gigs/manage-gigs.component';
import { MainComponent } from './view/main/main.component';
import { LoginComponent } from './view/login/login.component';
import {RoutingModule} from "./routing/routing.module";
import {SellerService} from "./services/seller.service";
import {NgxPaginationModule} from "ngx-pagination";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {AdminloginService} from "./services/adminlogin.service";
import {AdminGuard} from "./guards/admin.guard";
import {SellerAccountService} from "./services/seller-account.service";

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    ManageSellersComponent,
    ManageSellersAccountComponent,
    ManageGigsComponent,
    MainComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    RoutingModule,
    NgxPaginationModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    SellerService,
    AdminloginService,
    SellerAccountService,
    AdminGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
