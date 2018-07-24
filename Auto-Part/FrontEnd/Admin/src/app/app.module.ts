import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MainComponent } from './main/main.component';
import { ManageSellerComponent } from './manage-seller/manage-seller.component';

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    ManageSellerComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
