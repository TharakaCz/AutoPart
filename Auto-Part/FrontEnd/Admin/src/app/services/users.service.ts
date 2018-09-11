import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {MAIN_URL} from "./url.service";

const URL="/api/v1/customers";
@Injectable()
export class UsersService {

  constructor(private http:HttpClient) { }

  getTotelCustomers():Observable<number>{
    return this.http.get<number>(MAIN_URL+URL+"/count");
  }
}
