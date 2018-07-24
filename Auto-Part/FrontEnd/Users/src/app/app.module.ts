import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { ViewComponent } from './view/view.component';
import { MainComponent } from './view/main/main.component';
import { GigPageComponent } from './view/gig-page/gig-page.component';
import { DashbordComponent } from './view/dashbord/dashbord.component';
import {RoutingModule} from "./routing/routing.module";


@NgModule({
  declarations: [
    AppComponent,
    ViewComponent,
    MainComponent,
    GigPageComponent,
    DashbordComponent,

  ],
  imports: [
    BrowserModule,
    RoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
