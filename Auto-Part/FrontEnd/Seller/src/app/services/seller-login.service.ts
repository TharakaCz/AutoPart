import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";
import {Login} from "../dtos/login";
import {Observable} from "rxjs";
import {map} from "rxjs/operators";


export const MAIN_URL="http://localhost:8080";
const URL = "/api/v1/sellerAccountLogin";

@Injectable()
export class SellerLoginService {

  constructor(private http:HttpClient,private router:Router) { }

  login(seller:Login):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,seller)
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
    if (sessionStorage.getItem("token")) {
      return sessionStorage.getItem("token")== 'false' ? false:true;
    }
  }

  logout():void{
    sessionStorage.removeItem("token");
    this.router.navigate(['/login']);
  }
}
