import {Component, OnInit, ViewChild} from '@angular/core';
import {AlertModule, AlertService} from "ngx-alerts";
import {DiliverService} from "../../services/diliver.service";
import {Diliver} from "../../dtos/diliver";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-dilivers',
  templateUrl: './dilivers.component.html',
  styleUrls: ['./dilivers.component.css']
})
export class DiliversComponent implements OnInit {

  diliver:Array<Diliver>=[];
  selectDiliver:Diliver = new Diliver();

  @ViewChild("frmDiliver") frmDiliver:NgForm;
  constructor(private diliverService:DiliverService) { }

  ngOnInit() {
    this.loardAllDilivers();
  }

  loardAllDilivers():void{
    this.diliverService.getAllDiliver().subscribe(
      (result)=>{
        this.diliver = result;
      }
    )
  }

  saveDiliver():void{
    this.diliverService.save(this.selectDiliver).subscribe(
      (result)=>{
        if (result){
          alert("Added");
          this.loardAllDilivers();
        } else {
         alert("faild");
        }
      }
    )
  }

  deleteDeiliver(delivers:Diliver):void{
    if (confirm("You Want to Shure Delete This Diliver")){
      this.diliverService.delete(delivers.dNic).subscribe(
        (result)=>{
          if (result){
            alert("Deliver Detete Succsess");
            this.loardAllDilivers();
          } else {
            alert("Diliver Delete Faild");
          }
        }

      )
    }
  }

}
