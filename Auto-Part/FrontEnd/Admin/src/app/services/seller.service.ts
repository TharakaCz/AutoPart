import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

import {Seller} from "../dtos/seller";
import {Observable} from "rxjs/internal/Observable";

export  const MAIN_URL="http://localhost:8080";
const URL="/api/v1/sellers";

@Injectable()
export class SellerService {

  constructor(private http:HttpClient) { }

  getAllSellers():Observable<Array<Seller>>{
    return this.http.get<Array<Seller>>(MAIN_URL+URL);
  }

  deleteSellers(id:string):Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+URL+"/"+id);
  }

  saveSellers(seller:Seller):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,seller);
  }

  getTotalSellers():Observable<number>{
    return this.http.get<number>(MAIN_URL+URL+"/count");
  }
}
