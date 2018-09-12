import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MainComponent } from './view/main/main.component';
import { DashboardComponent } from './view/dashboard/dashboard.component';
import { UserRegistationComponent } from './view/user-registation/user-registation.component';
import { UserLoginComponent } from './view/user-login/user-login.component';
import { GigPageComponent } from './view/gig-page/gig-page.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule, Validators} from "@angular/forms";
import {RoutingModule} from "./routing/routing.module";
import {UserRegistationService} from "./services/user-registation.service";
import {AlertModule} from "ngx-alerts";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {URLService} from "./services/url.service";
import {PakageService} from "./services/pakage.service";
import { NavDirective } from './directive/nav.directive';
import {UserLoginService} from "./services/user-login.service";
import { LoginDirective } from './directive/login.directive';
import { ManageProfileComponent } from './view/manage-profile/manage-profile.component';
import { ComplainsComponent } from './view/complains/complains.component';
import {ComplainService} from "./services/complain.service";
import {CustomerService} from "./services/customer.service";

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    DashboardComponent,
    UserRegistationComponent,
    UserLoginComponent,
    GigPageComponent,
    NavDirective,
    LoginDirective,
    ManageProfileComponent,
    ComplainsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AlertModule.forRoot({maxMessages:5,timeout:5000}),
    FormsModule,
    RoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule
  ],
  providers: [
    UserRegistationService,
    URLService,
    PakageService,
    UserLoginService,
    ComplainService,
    CustomerService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
