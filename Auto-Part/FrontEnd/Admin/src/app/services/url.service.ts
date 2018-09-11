import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

export const MAIN_URL="http://localhost:8080";
@Injectable()
export class URLService {

  constructor(private http:HttpClient) { }


}
