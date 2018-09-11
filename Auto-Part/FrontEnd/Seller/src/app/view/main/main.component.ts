import { Component, OnInit } from '@angular/core';
import {SellerLoginService} from "../../services/seller-login.service";
import {Auth} from "../../dtos/auth";
import {LoginComponent} from "../login/login.component";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

   seller:Auth = new Auth();
  // faild:boolean;
  constructor(private autinticate:SellerLoginService) {

  }

  ngOnInit() {
    this.getLoginedSeller();

  }

  // name():void{
  //
  //   this.auth.isAuth();
  //
  //
  // }

  // auth():void{
  //   this.authinticated.auth(this.seller).subscribe(
  //
  //     (result)=>{
  //
  //       this.faild=!result;
  //     }
  //   )
  //
  // }


//   getAutinticate():void{
//     this.authinticated.getAuthinticate(this.seller)
// }

  getLoginedSeller():void{
    console.log("Sucsess")
    this.autinticate.getLoginedSeller().subscribe(
      (result)=>{
        this.seller=result;

      }
    )
  }
}

