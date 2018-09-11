import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Payments} from "../dtos/payments";
import {Observable} from "rxjs";
import {MAIN_URL} from "./url.service";


const URL = "/api/v1/payments";
@Injectable()
export class PaymentsService {

  constructor(private http:HttpClient) {}

  save(payments:Payments):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,payments);
  }

  delete(id:number):Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+URL+"/"+id);
  }

  getAllPayments():Observable<Array<Payments>>{
    return this.http.get<Array<Payments>>(MAIN_URL+URL);
  }

  getPayments(id:number):Observable<Payments>{
    return this.http.get<Payments>(MAIN_URL+URL+"/"+id);
  }
}
