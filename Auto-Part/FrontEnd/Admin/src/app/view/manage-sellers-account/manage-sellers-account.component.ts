import {Component, OnInit, ViewChild} from '@angular/core';
import {Accounts} from "../../dtos/accounts";
import {NgForm} from "@angular/forms";
import {SellerAccountService} from "../../services/seller-account.service";
import {AlertService} from "ngx-alerts";

@Component({
  selector: 'app-manage-sellers-account',
  templateUrl: './manage-sellers-account.component.html',
  styleUrls: ['./manage-sellers-account.component.css']
})
export class ManageSellersAccountComponent implements OnInit {

  sellersAccounts:Array<Accounts> =[];
  sellectedAccount:Accounts = new Accounts();
  tempAccount:Accounts = null;
  manuallySellected:boolean = false;
  @ViewChild("frmSellersAccounts") frmSellersAccounts:NgForm;

  constructor(private sellerAccontService:SellerAccountService,private alertService: AlertService) { }

  ngOnInit() {
    this.loardAllSellerAccounts();
  }

  loardAllSellerAccounts():void{
    this.sellerAccontService.getAllSellerAcccounts().subscribe(
      (result)=>{
        this.sellersAccounts=result;
      }
    )
  }

  deleteSellerAccount(sellerAccount:Accounts):void{
    if (confirm("You Want to Delete This Seller Accont")) {
      this.sellerAccontService.deleteSellerAccount(sellerAccount.aNic).subscribe(
        (result)=>{
          if (result){
            this.alertService.danger('Seller Sussess Fully Deleted');
          } else {
            this.alertService.warning('Seller Delete Proccsess Faild Pleace Try Again');
          }
          this.loardAllSellerAccounts();
        }
      )
    }
  }

  sellectSellerAccount(sellerAccount:Accounts):void{
    this.clear();

    this.sellectedAccount = sellerAccount;
    this.tempAccount = Object.assign({},sellerAccount);
    this.manuallySellected = true;
  }

  clear():void{
    let index = this.sellersAccounts.indexOf(this.sellectedAccount);
    if (index !== -1){
      this.sellersAccounts[index] = this.tempAccount;
      this.tempAccount = null;
      this.alertService.info('Row Clear Sussessfully');
    }
    this.sellectedAccount = new Accounts();
    this.manuallySellected = false;
  }

  saveSellersAccount():void{
    this.sellerAccontService.saveSellerAccount(this.sellectedAccount).subscribe(
      (result)=>{
        if (result){
          this.alertService.success('Seller Account Succsessfully Added');
          this.loardAllSellerAccounts();
        } else {
          this.alertService.warning('Seller Account Added Faild');
        }
      }
    )
  }

}
