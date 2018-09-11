import { Component, OnInit } from '@angular/core';
import {DiliverService} from "../../services/diliver.service";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  totalDilivers:number = 10;

  constructor(private diliverService:DiliverService) { }

  ngOnInit() {
    this.countDilivers();
  }

  countDilivers():void{
    this.diliverService.getAllDilivers().subscribe(
      (result)=>{
        this.totalDilivers = result;
      }
    )
  }
}
