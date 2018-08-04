import {Component, OnInit, ViewChild} from '@angular/core';
import {UserRegistationService} from "../../services/user-registation.service";
import {AlertService} from "ngx-alerts";
import {Users} from "../../dtos/users";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-user-registation',
  templateUrl: './user-registation.component.html',
  styleUrls: ['./user-registation.component.css']
})
export class UserRegistationComponent implements OnInit {

  users:Array<Users>=[];
  selectedUsers:Users = new Users();
  @ViewChild("frmUsers") frmUsers:NgForm;
  constructor(private userService:UserRegistationService,private alertService:AlertService) { }

  ngOnInit() {
  }

  saveUsers():void{
    this.userService.saveCustomer(this.selectedUsers).subscribe(
      (result)=>{
        if (result) {
          this.alertService.success('Youer Account Succsessfully Created');
        }else {
          this.alertService.warning('Youer Account Create Faild Pleace Try Again');
        }
      }
    )
  }
}
