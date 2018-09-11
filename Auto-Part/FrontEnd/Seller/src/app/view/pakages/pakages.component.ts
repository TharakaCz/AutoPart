import { Component, OnInit } from '@angular/core';
import {PakagesService} from "../../services/pakages.service";
import {AlertService} from "ngx-alerts";
import {Pakages} from "../../dtos/pakages";

@Component({
  selector: 'app-pakages',
  templateUrl: './pakages.component.html',
  styleUrls: ['./pakages.component.css']
})
export class PakagesComponent implements OnInit {

  pakages:Pakages = new Pakages();
  pakage:Array<Pakages> = [];
  constructor(private pakagersService:PakagesService) { }

  ngOnInit() {
    this.loardAllPakages();

  }

  loardAllPakages():void{
    this.pakagersService.getAllPakage().subscribe(
      (result)=>{
        this.pakage = result;
      }
    )
  }

}
