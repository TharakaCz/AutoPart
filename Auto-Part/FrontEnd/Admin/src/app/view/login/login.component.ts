import { Component, OnInit } from '@angular/core';
import {Admin} from "../../dtos/admin";
import {AdminloginService} from "../../services/adminlogin.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  admin: Admin = new Admin();
  failed:boolean;

  constructor(private adminLogin:AdminloginService) { }

  ngOnInit() {
  }

  login():void{
    this.adminLogin.login(this.admin).subscribe(
      (result)=>{
        this.failed = !result;
      }
    )
  }

}
