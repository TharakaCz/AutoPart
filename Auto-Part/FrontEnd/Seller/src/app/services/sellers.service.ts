import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Seller} from "../dtos/seller";
import {MAIN_URL} from "./url.service";

const URL = "/api/v1/sellers";
@Injectable()
export class SellersService {

  constructor(private http:HttpClient) { }

  getAllSellers():Observable<Array<Seller>>{
    return this.http.get<Array<Seller>>(MAIN_URL+URL);
  }

  getSellers(sNic:string):Observable<Seller>{
    return this.http.get<Seller>(MAIN_URL+URL+"/"+sNic);
  }
}
