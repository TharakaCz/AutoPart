import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DashboardComponent } from './view/dashboard/dashboard.component';
import { MainComponent } from './view/main/main.component';
import { LoginComponent } from './view/login/login.component';
import { ManageSellersComponent } from './view/manage-sellers/manage-sellers.component';
import { ManageSellersAccountComponent } from './view/manage-sellers-account/manage-sellers-account.component';
import { ManageGigsComponent } from './view/manage-gigs/manage-gigs.component';
import {RoutingModule} from "./routing/routing.module";
import {NgxPaginationModule} from "ngx-pagination";
import {AlertModule} from "ngx-alerts";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {SellerService} from "./services/seller.service";
import {AdminloginService} from "./services/adminlogin.service";
import {SellerAccountService} from "./services/seller-account.service";
import {AdminGuard} from "./guards/admin.guard";
import {UsersService} from "./services/users.service";
import {PaymentService} from "./services/payment.service";

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    MainComponent,
    LoginComponent,
    ManageSellersComponent,
    ManageSellersAccountComponent,
    ManageGigsComponent
  ],
  imports: [
    BrowserModule,
    RoutingModule,
    NgxPaginationModule,
    AlertModule.forRoot({maxMessages:5,timeout:5000}),
    HttpClientModule,
    FormsModule
  ],
  providers: [
    SellerService,
    AdminloginService,
    SellerAccountService,
    PaymentService,
    UsersService,
    AdminGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
