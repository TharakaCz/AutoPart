import { Component, OnInit } from '@angular/core';
import {SellerService} from "../../services/seller.service";
import {SellerAccountService} from "../../services/seller-account.service";
import {UsersService} from "../../services/users.service";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  totalSellers:number = 10;
  totalSerllerAccounts:number = 10;
  totalUsers:number = 10;

  constructor(private sellerService:SellerService,private sellerAccounts:SellerAccountService,private userService:UsersService) { }

  ngOnInit() {
    this.getTotalSellers();
    this.getTotalSellerAccounts();
    this.getTotelUsers();
  }
  getTotalSellers():void{
    this.sellerService.getTotalSellers().subscribe(
      (count)=>{
        this.totalSellers = count;
      }
    )
  }

  getTotalSellerAccounts():void{
    this.sellerAccounts.getAllSellerAccount().subscribe(
      (count)=>{
        this.totalSerllerAccounts = count;
      }
    )
  }

  getTotelUsers():void{
    this.userService.getTotelCustomers().subscribe(
      (count)=>{
        this.totalUsers = count;
      }
    )
  }

}
