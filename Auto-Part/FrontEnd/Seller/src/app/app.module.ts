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
import { ProfileComponent } from './view/profile/profile.component';
import { NavbarDirective } from './directive/navbar.directive';
import {LoggerNameService} from "./services/logger-name.service";
import { OrdersComponent } from './view/orders/orders.component';
import { DiliversComponent } from './view/dilivers/dilivers.component';
import {DiliverService} from "./services/diliver.service";
import {ImageUploardService} from "./services/image-uploard.service";
import { PakagesComponent } from './view/pakages/pakages.component';
import {PakagesService} from "./services/pakages.service";
import {SellersService} from "./services/sellers.service";
import { NavDirective } from './directive/nav.directive';
import {ComplainsService} from "./services/complains.service";




@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MainComponent,
    DashboardComponent,
    PaymentsComponent,
    ManageGigsComponent,
    ProfileComponent,
    NavbarDirective,
    OrdersComponent,
    DiliversComponent,
    PakagesComponent,
    NavDirective,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RoutingModule,
    FormsModule,
    AlertModule.forRoot({maxMessages:5,timeout:5000}),
    NgxPaginationModule,
    ReactiveFormsModule
  ],
  providers: [
    PaymentsService,
    SellerLoginService,
    LoginGuard,
    LoggerNameService,
    DiliverService,
    ImageUploardService,
    PakagesService,
    SellersService,
    ComplainsService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
