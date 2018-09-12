import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Users} from "../dtos/users";
import {Observable} from "rxjs";
import {MAIN_URL} from "./url.service";
import {Complain} from "../dtos/complain";

const URL="/api/v1/complains";
@Injectable()
export class ComplainService {

  constructor(private http:HttpClient) { }

  save(comp:Complain):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,comp);
  }



}
