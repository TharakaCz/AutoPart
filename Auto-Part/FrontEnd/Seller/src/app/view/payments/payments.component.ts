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

  Payments:Payments = new Payments();
  searchPakage:Pakages = new Pakages();
  searchSellers:Seller = new Seller();
  pakages:Array<Pakages>=[];
  @ViewChild("frmPayments") frmPayments:NgForm;
  constructor(private paymentService:PaymentsService,private alertService:AlertService,
              private pakageService:PakagesService,private sellersService:SellersService) { }

  ngOnInit() {
    this.loardPakage();
  }

  loardPakage():void{
    this.pakageService.getAllPakage().subscribe(
      (result)=>{
        this.pakages = result;
      }
    )
  }


  getSeller():void{
    this.sellersService.getSellers(this.searchSellers.sNic).subscribe(
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

  perchese():void {
    this.Payments.sellerDTO = this.searchSellers;
    this.Payments.pakagesDTO = this.searchPakage;

    this.paymentService.save(this.Payments).subscribe(
      (result)=>{
        if (result){
          this.alertService.success("Payment Succsessfully");

        } else {
          this.alertService.warning("Paymen Proceed Faild Pleace Try Again");
        }
      }
    )
  }

  }


