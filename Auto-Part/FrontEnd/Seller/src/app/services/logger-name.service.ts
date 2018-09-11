import { Injectable } from '@angular/core';
import {Auth} from "../dtos/auth";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {MAIN_URL} from "./url.service";

const URL = "/api/v1/sellerAccountLogin";

@Injectable()
export class LoggerNameService {


  logger:Auth = new Auth();

  constructor(private http:HttpClient) { }


  authName(aNic:string):Observable<Auth>{
    return this.http.get<Auth>(MAIN_URL+URL+"/"+aNic);
  }
}
