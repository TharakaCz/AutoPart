import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {MAIN_URL} from "./url.service";



const URL="/api/v1/fileUploard/file";
@Injectable()
export class ImageUploardService {

  constructor(private http:HttpClient) { }

  singleFileUpload(file:FormData):Observable<boolean>{
    console.log(file)
    return this.http.post<boolean>(MAIN_URL+URL,file);
  }
}
