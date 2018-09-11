import {Component, ElementRef, OnInit} from '@angular/core';
import {Login} from "../../dtos/login";
import {SellerLoginService} from "../../services/seller-login.service";
import {Auth} from "../../dtos/auth";
import {LoggerNameService} from "../../services/logger-name.service";


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  seller: Login = new Login();
  auth: Auth = new Auth();
  id: string;
  true: boolean;
  name: Auth = new Auth();
  failed: boolean;


  constructor(private authinticated: SellerLoginService, private logger: LoggerNameService) {
  }

  ngOnInit() {
  }

  login(): void {
    this.authinticated.login(this.seller).subscribe(
      (result) => {

        this.failed = !result;
      }
    )
  }

  // authName():void {
  //
  //   this.logger.authName(this.auth.aNic).subscribe(
  //     (result)=>{
  //       this.auth = result;
  //     }
  //   )
  //   }




    // this.logger.authName(txtUserID.getValue(this.auth.aNic));






}
