import { Component, OnInit } from '@angular/core';
import {Login} from "../../dtos/login";
import {SellerLoginService} from "../../services/seller-login.service";


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  seller:Login = new Login();
  failed:boolean;

  constructor(private authinticated:SellerLoginService) { }

  ngOnInit() {
  }

  login():void{
    this.authinticated.login(this.seller).subscribe(
      (result)=>{

        this.failed = !result;
      }
    )
  }
}
