import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";;
import {Observable} from "rxjs";
import {MAIN_URL} from "./url.service";
import {Pakages} from "../dtos/pakages";

const URL="/api/v1/pakages";
@Injectable()
export class PakagesService {

  constructor(private http:HttpClient) { }

  save(pakage: Pakages):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,pakage);
  }

  delete(id:number):Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+URL+"/"+id);
  }

  getAllPakage():Observable<Array<Pakages>>{
    return this.http.get<Array<Pakages>>(MAIN_URL+URL);
  }

  getPakage(id:number):Observable<Pakages>{
    return this.http.get<Pakages>(MAIN_URL+URL+"/"+id);
  }

  TotalPakages():Observable<number>{
    return this.http.get<number>(MAIN_URL+URL+"/count");
  }
}
