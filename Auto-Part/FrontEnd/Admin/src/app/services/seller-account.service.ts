import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {SellerAccount} from "../dtos/seller-account";
import {Observable} from "rxjs/internal/Observable";

export const MAIN_URL ="http://localhost:8080";
const URL="api/v1/SellerAccounts";

@Injectable()
export class SellerAccountService {

  constructor(private http:HttpClient) { }

  getAllSellerAcccounts():Observable<Array<SellerAccount>>{
    return this.http.get<Array<SellerAccount>>(MAIN_URL+URL);
  }

  deleteSellerAccount(email:string):Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+URL+"/"+email);
  }

  saveSellerAccount(sellerAccount:SellerAccount):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,sellerAccount);
  }

  getSellerAccounts(email:string):Observable<Array<SellerAccount>>{
    return this.http.get<Array<SellerAccount>>(MAIN_URL+URL+"/"+email);
  }
  getAllSellerAccount():Observable<number>{
    return this.http.get<number>(MAIN_URL+URL+"/count");
  }
}
