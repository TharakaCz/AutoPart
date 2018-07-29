import { Component, OnInit } from '@angular/core';
import {Seller} from "../../dtos/seller";
import {SellerService} from "../../services/seller.service";

@Component({
  selector: 'app-manage-sellers',
  templateUrl: './manage-sellers.component.html',
  styleUrls: ['./manage-sellers.component.css']
})
export class ManageSellersComponent implements OnInit {

  sellers:Array<Seller> =[];

  constructor(private sellerService:SellerService) { }

  ngOnInit() {
    this.loadAllSellers();
  }
  loadAllSellers():void{
    this.sellerService.getAllSellers().subscribe(
      (result) =>{
        this.sellers = result;

      }
    )
  }

}
