import { Component, OnInit } from '@angular/core';
import {UserLoginService} from "../../services/user-login.service";
import {Users} from "../../dtos/users";

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

 users:Users = new Users();
 faild:boolean;
  constructor(private userLogin:UserLoginService) { }

  ngOnInit() {
  }

  login():void{

    this.userLogin.canAuthenticate(this.users).subscribe(
      (result)=>{
        this.faild = !result;
      }
    )
  }
}
