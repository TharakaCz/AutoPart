import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Pakages} from "../dtos/pakages";
import {Observable} from "rxjs";
import {MAIN_URL} from "./url.service";

const URL="/api/v1/pakages";

@Injectable()
export class PakagesService {

  constructor(private http:HttpClient) { }


  save(pakages:Pakages):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,pakages);
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
}
