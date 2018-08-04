import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Accounts} from "../dtos/accounts";

export const MAIN_URL ="http://localhost:8080";
const URL="/api/v1/sellerAccounts";

@Injectable()
export class SellerAccountService {

  constructor(private http:HttpClient) { }

  getAllSellerAcccounts():Observable<Array<Accounts>>{
    return this.http.get<Array<Accounts>>(MAIN_URL+URL);
  }

  deleteSellerAccount(aNic:string):Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+URL+"/"+aNic);
  }

  saveSellerAccount(sellerAccount:Accounts):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,sellerAccount);
  }

  getSellerAccounts(aemail:string):Observable<Array<Accounts>>{
    return this.http.get<Array<Accounts>>(MAIN_URL+URL+"/"+aemail);
  }
  getAllSellerAccount():Observable<number>{
    return this.http.get<number>(MAIN_URL+URL+"/count");
  }

}
