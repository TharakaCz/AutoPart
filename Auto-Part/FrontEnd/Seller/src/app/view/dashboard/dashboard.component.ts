import { Component, OnInit } from '@angular/core';
import {DiliverService} from "../../services/diliver.service";
import {ComplainsService} from "../../services/complains.service";


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  totalDilivers:number = 10;

  totalComplains:number = 10;

  constructor(private diliverService:DiliverService,private complainService:ComplainsService) { }

  ngOnInit() {
    this.countDilivers();
    this.countComplains();
  }

  countDilivers():void{
    this.diliverService.getAllDilivers().subscribe(
      (result)=>{
        this.totalDilivers = result;
      }
    )
  }

  countComplains():void{
    this.complainService.TotalPayment().subscribe(
      (result)=>{
        this.totalComplains = result;
      }
    )
  }
}
