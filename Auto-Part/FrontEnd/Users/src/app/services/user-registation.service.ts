import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Users} from "../dtos/users";

export const MAIN_URL="http://localhost:8080";
const URL="/api/v1/customers";
@Injectable()
export class UserRegistationService {

  constructor(private http:HttpClient) { }

  deleteCustomer(id:String):Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+URL+"/"+id);
  }

  saveCustomer(user:Users):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,user);
  }

  getTotelCustomers():Observable<number>{
    return this.http.get<number>(MAIN_URL+URL+"/count");
  }
}
