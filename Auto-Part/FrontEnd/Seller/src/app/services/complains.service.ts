import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {MAIN_URL} from "./url.service";

const URL="/api/v1/payments";
@Injectable()
export class ComplainsService {

  constructor(private http:HttpClient) { }


  TotalPayment():Observable<number>{
    return this.http.get<number>(MAIN_URL+URL+"/count");
  }
}
