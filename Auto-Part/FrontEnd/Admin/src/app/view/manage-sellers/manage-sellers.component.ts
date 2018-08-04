import {Component, OnInit, ViewChild} from '@angular/core';
import {SellerService} from "../../services/seller.service";
import {AlertService} from "ngx-alerts";
import {Seller} from "../../dtos/seller";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-manage-sellers',
  templateUrl: './manage-sellers.component.html',
  styleUrls: ['./manage-sellers.component.css']
})
export class ManageSellersComponent implements OnInit {

  sellers:Array<Seller> =[];
  selectedSellers:Seller = new Seller();
  tempSeller:Seller = null;
  manuallySellected: boolean = false;
  @ViewChild("frmSellers") frmSellers:NgForm;

  constructor(private sellerService:SellerService,private alertService: AlertService) { }

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

  deleteSellers(seller:Seller):void{
    if (confirm("Are You Want To Delete This Seller ?")) {
      this.sellerService.deleteSellers(seller.sNic).subscribe(
        (result)=>{
          if(result){
            this.alertService.danger('Seller Sussess Fully Deleted');
          }else {
            this.alertService.warning('Delete Prosses Faild Try Again')
          }
          this.loadAllSellers();
        }
      )
    }
  }
  selectSeller(seller: Seller):void{
    this.clear();
    this.selectedSellers = seller;
    this.tempSeller = Object.assign({},seller);
    this.manuallySellected = true;
  }

  clear():void{
    let index = this.sellers.indexOf(this.selectedSellers);
    if (index !== -1){
      this.sellers[index] = this.tempSeller;
      this.tempSeller = null;
    }

    this.selectedSellers = new Seller();
    this.manuallySellected = false;
  }

  saveSellers():void{
    this.sellerService.saveSellers(this.selectedSellers).subscribe(
      (result)=>{
        if (result){
          this.alertService.success('Seller Has Been Sucsessfully Added');
          this.loadAllSellers();
        }else {
          this.alertService.warning('Seller Saved Faild Try Again')
        }
      }
    )
  }

}
