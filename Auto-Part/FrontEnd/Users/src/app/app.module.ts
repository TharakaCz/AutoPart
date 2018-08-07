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

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    DashboardComponent,
    UserRegistationComponent,
    UserLoginComponent,
    GigPageComponent
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
    UserRegistationService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
