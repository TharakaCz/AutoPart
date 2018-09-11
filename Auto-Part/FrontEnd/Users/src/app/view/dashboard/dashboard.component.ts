import { Component, OnInit } from '@angular/core';
import {PakageService} from "../../services/pakage.service";
import {Pakages} from "../../dtos/pakages";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  pakage:Array<Pakages> = [];

  constructor(private pakageService:PakageService) { }

  ngOnInit() {
    this.getAllPake();
  }

  getAllPake():void{
    this.pakageService.getAllPakage().subscribe(
      (result)=>{
        this.pakage = result;
      }
    )
  }
}
