import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Pakages} from "../dtos/pakages";
import {MAIN_URL} from "./url.service";

const URL ="/api/v1/pakages";
@Injectable()
export class PakageService {

  constructor(private http:HttpClient) { }

  getAllPakage():Observable<Array<Pakages>>{
    return this.http.get<Array<Pakages>>(MAIN_URL+URL);
  }
}
