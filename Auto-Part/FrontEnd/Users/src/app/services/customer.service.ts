import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Users} from "../dtos/users";
import {MAIN_URL} from "./url.service";

const URL="/api/v1/customers";
@Injectable()
export class CustomerService {

  constructor(private http:HttpClient) { }

  getAllCustomers():Observable<Array<Users>>{
    return this.http.get<Array<Users>>(MAIN_URL+URL);
  }

  getCustomer(cNic:string):Observable<Users>{
    return this.http.get<Users>(MAIN_URL+URL+"/"+cNic);
  }
}
