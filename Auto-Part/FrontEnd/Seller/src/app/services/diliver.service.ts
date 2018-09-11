import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Diliver} from "../dtos/diliver";
import {Observable} from "rxjs";
import {MAIN_URL} from "./url.service";

const URL="/api/v1/diliver";

@Injectable()
export class DiliverService {

  constructor(private http:HttpClient) { }

  save(diliver:Diliver):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL+"/",diliver);
  }

  delete(dNic:string):Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+URL+"/"+dNic);
  }

  getAllDiliver():Observable<Array<Diliver>>{
    return this.http.get<Array<Diliver>>(MAIN_URL+URL);
  }

  getAllDilivers():Observable<number>{
    return this.http.get<number>(MAIN_URL+URL+"/count")
  }
}
