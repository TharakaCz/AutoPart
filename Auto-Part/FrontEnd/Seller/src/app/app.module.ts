import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LoginComponent } from './view/login/login.component';
import { MainComponent } from './view/main/main.component';
import { DashboardComponent } from './view/dashboard/dashboard.component';
import { PaymentsComponent } from './view/payments/payments.component';
import { ManageGigsComponent } from './view/manage-gigs/manage-gigs.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {AlertModule} from "ngx-alerts";
import {NgxPaginationModule} from "ngx-pagination";
import {LoginGuard} from "./guards/login.guard";
import {RoutingModule} from "./routing/routing.module";
import {SellerLoginService} from "./services/seller-login.service";
import {PaymentsService} from "./services/payments.service";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MainComponent,
    DashboardComponent,
    PaymentsComponent,
    ManageGigsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RoutingModule,
    FormsModule,
    AlertModule,
    NgxPaginationModule,
    ReactiveFormsModule
  ],
  providers: [
    PaymentsService,
    SellerLoginService,
    LoginGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
