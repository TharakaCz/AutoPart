import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";
import {Admin} from "../dtos/admin";
import {Observable} from "rxjs";
import {map} from "rxjs/operators";
import {MAIN_URL} from "./url.service";

const URL= "/api/v1/adminlogin";

@Injectable()
export class AdminloginService {

  constructor(private http:HttpClient,private router: Router) { }

  login(admin:Admin):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,admin)
      .pipe(
        map((result)=>{
          sessionStorage.setItem("token",result+"");
          if (result){
            this.router.navigate(['/main']);
          }
          return result;
        })
      )
  }

  isAuthenticated():boolean{
    if (sessionStorage.getItem("token")){
      return sessionStorage.getItem("token")== 'false' ? false : true;
    }
  }

  logout():void{
    sessionStorage.removeItem("token");
    this.router.navigate(['/login']);
  }

}
