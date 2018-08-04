import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";


export const MAIN_URL="http://localhost:8080";
const URL="/api/v1/customers";
@Injectable()
export class UsersService {

  constructor(private http:HttpClient) { }

  getTotelCustomers():Observable<number>{
    return this.http.get<number>(MAIN_URL+URL+"/count");
  }
}
