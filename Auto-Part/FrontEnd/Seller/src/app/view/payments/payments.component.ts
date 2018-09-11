import {Component, OnInit, ViewChild} from '@angular/core';
import {AlertService} from "ngx-alerts";
import {Payments} from "../../dtos/payments";
import {NgForm} from "@angular/forms";
import {PakagesService} from "../../services/pakages.service";
import {Pakages} from "../../dtos/pakages";
import {SellersService} from "../../services/sellers.service";
import {Seller} from "../../dtos/seller";
import {PaymentsService} from "../../services/payments.service";



@Component({
  selector: 'app-payments',
  templateUrl: './payments.component.html',
  styleUrls: ['./payments.component.css']
})

export class PaymentsComponent implements OnInit {

  selectPayments:Payments = new Payments();
  searchPakage:Pakages = new Pakages();
  searchSellers:Seller = new Seller();
  pakages:Array<Pakages>=[];
  sellers:Array<Seller>=[];
  pakage:Array<Pakages>=[];
  @ViewChild("frmPayments") frmPayments:NgForm;
  constructor(private paymentService:PaymentsService,private alertService:AlertService,
              private pakageService:PakagesService,private sellersService:SellersService) { }

  ngOnInit() {
    this.loardPakage();
    this.loardAllSellers();
  }

  loardPakage():void{
    this.pakageService.getAllPakage().subscribe(
      (result)=>{
        this.pakage = result;
      }
    )
  }

  loardAllSellers():void{
    this.sellersService.getAllSellers().subscribe(
      (result)=>{
        this.sellers = result;
      }
    )
  }

  getSeller(event:any):void{
    this.sellersService.getSellers(event.target.value).subscribe(
      (result)=>{
        this.searchSellers = result;
      }
    )

  }

  getPakage(event:any):void{
    this.pakageService.getPakage(event.target.value).subscribe(
      (result)=>{
        this.searchPakage = result;
      }
    )
  }
  perchese():void{

    this.selectPayments = new Payments();
    this.selectPayments.sellers=this.searchSellers;

    this.paymentService.save(this.selectPayments).subscribe(
      (result)=>{
        if (result){
          this.alertService.success("Youer Payment Is Succsessfully");
        } else {
          this.alertService.warning("Youer Payment Placed Faild");
        }
      }
    )
  }

  }


