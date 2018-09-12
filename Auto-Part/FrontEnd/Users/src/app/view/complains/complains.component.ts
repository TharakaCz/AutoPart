import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {NgForm} from "@angular/forms";
import {AlertService} from "ngx-alerts";
import {Users} from "../../dtos/users";
import {ComplainService} from "../../services/complain.service";
import {CustomerService} from "../../services/customer.service";
import {Complain} from "../../dtos/complain";


@Component({
  selector: 'app-complains',
  templateUrl: './complains.component.html',
  styleUrls: ['./complains.component.css']
})
export class ComplainsComponent implements OnInit {

  @ViewChild('frmComplains') frmComplains:NgForm;
  comp:Complain = new Complain();
  customers:Array<Users>=[];
  user:Users = new Users();
  constructor(private customer:CustomerService,private alertService:AlertService,private complainsService:ComplainService,private elm:ElementRef) { }

  ngOnInit() {

    this.loardCustomer();
  }

  loardCustomer():void{

    this.customer.getAllCustomers().subscribe(
      (result)=>{
        this.customers = result;
      }
    )
  }

  getUser():void{

    this.customer.getCustomer(this.user.cNic).subscribe(
      (result)=>{
        this.user = result;
      }
    )


  }

  add():void{

    this.comp.customerDTO = this.user;
    this.complainsService.save(this.comp).subscribe(
      (result)=>{
         if (result){
           this.alertService.success("Complain Send Succsessfully");
         } else {
           this.alertService.warning("Complain Send Faild Pleace Try Again");
         }
      }
    )
  }

}
