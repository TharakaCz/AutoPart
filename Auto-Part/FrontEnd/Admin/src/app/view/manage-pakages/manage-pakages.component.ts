import {Component, OnInit, ViewChild} from '@angular/core';
import {PakagesService} from "../../services/pakages.service";
import {AlertService} from "ngx-alerts";
import {Pakages} from "../../dtos/pakages";
import {NgForm} from "@angular/forms";


@Component({
  selector: 'app-manage-pakages',
  templateUrl: './manage-pakages.component.html',
  styleUrls: ['./manage-pakages.component.css']
})
export class ManagePakagesComponent implements OnInit {

  @ViewChild("frmPakage") frmPakage:NgForm;
  pakage:Array<Pakages> = [];
  selectPakages:Pakages = new Pakages();
  constructor(private pakagesService:PakagesService,private alertservice:AlertService) { }

  ngOnInit() {
    this.getAllPakage();
  }

  getAllPakage():void{
    this.pakagesService.getAllPakage().subscribe(
      (result)=>{
        this.pakage = result;
      }
    )
  }

  savePakages():void{
    this.pakagesService.save(this.selectPakages).subscribe(
      (result)=>{
        if (result) {
          this.alertservice.success("Pakages Succsessfully Added");
        }else {
          this.alertservice.warning("Pakeges Added Faild");
        }
      }
    )
  }
}
