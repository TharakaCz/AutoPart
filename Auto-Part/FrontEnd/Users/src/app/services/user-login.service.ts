import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {MAIN_URL} from "./url.service";
import {Users} from "../dtos/users";
import {map} from "rxjs/operators";


const URL="api/v1/sellerAccountLogin";
@Injectable()
export class UserLoginService {

  constructor(private http:HttpClient) { }

  canAuthenticate(user:Users):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,user)
      .pipe(
        map((result)=>{
          sessionStorage.setItem("token",result+"");
          return result;
        })
      )
  }
}

