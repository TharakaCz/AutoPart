import { Component, OnInit } from '@angular/core';
import {AdminloginService} from "../../services/adminlogin.service";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  constructor(private adminService:AdminloginService) { }

  ngOnInit() {
  }
logout():void{
    this.adminService.logout();
}
}
