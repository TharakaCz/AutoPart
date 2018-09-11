import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";
import {Login} from "../dtos/login";
import {Observable, pipe} from "rxjs";
import {map} from "rxjs/operators";
import {Auth} from "../dtos/auth";

import {MAIN_URL} from "./url.service";


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

  authName(aNic:string):Observable<Auth>{
    return this.http.get<Auth>(MAIN_URL+URL+"/"+aNic)
    .pipe(
      map((result=>{
        sessionStorage.getItem("token");
        return result;
      }))
    )
  }

  getLoginedSeller():Observable<Auth>{
    return this.http.get<Auth>(MAIN_URL+URL+'/logined');
  }

  // isAuth():boolean{
  //   if (sessionStorage.getItem("name")){
  //     return sessionStorage.getItem("name")=='false'? false:true;
  //   }
  // }
  // getSellerAccounts(aemail:string):Observable<Array<Accounts>>{
  //   return this.http.get<Array<Accounts>>(MAIN_URL+URL+"/"+aemail);
  // }
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
