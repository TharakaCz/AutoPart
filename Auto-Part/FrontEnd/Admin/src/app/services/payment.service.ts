import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable()
export class PaymentService {

  constructor(private http:HttpClient) { }
}
