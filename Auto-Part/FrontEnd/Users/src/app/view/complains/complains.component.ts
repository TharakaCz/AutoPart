import {Component, OnInit, ViewChild} from '@angular/core';
import {NgForm} from "@angular/forms";
import {SellersService} from "../../../../../Seller/src/app/services/sellers.service";
import {AlertService} from "ngx-alerts";
import {Users} from "../../dtos/users";

@Component({
  selector: 'app-complains',
  templateUrl: './complains.component.html',
  styleUrls: ['./complains.component.css']
})
export class ComplainsComponent implements OnInit {

  @ViewChild('frmComplains') frmComplains:NgForm;

  user:Users = new Users();
  constructor(private seller:SellersService,private alertService:AlertService) { }

  ngOnInit() {
  }


}
