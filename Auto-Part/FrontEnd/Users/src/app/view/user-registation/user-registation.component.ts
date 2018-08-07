import {Component, OnInit, ViewChild} from '@angular/core';
import {UserRegistationService} from "../../services/user-registation.service";
import {AlertService} from "ngx-alerts";
import {Users} from "../../dtos/users";
import {FormBuilder, FormGroup, NgForm, Validators} from "@angular/forms";

@Component({
  selector: 'app-user-registation',
  templateUrl: './user-registation.component.html',
  styleUrls: ['./user-registation.component.css']
})
export class UserRegistationComponent implements OnInit {

  registerForm:FormGroup;
  submitted = false;
  users:Array<Users>=[];
  selectedUsers:Users = new Users();
  @ViewChild("frmUsers") frmUsers:NgForm;
  constructor(private userService:UserRegistationService,private alertService:AlertService,private formBuilder:FormBuilder) { }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      cNic: ['', Validators.required],
      cName: ['', Validators.required],
      cEmail: ['', [Validators.required, Validators.email]],
      cAddress: ['', Validators.required],
      cContact:['',Validators.required],
      password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  get f() { return this.registerForm.controls; }

  saveUsers():void{

    this.submitted = true;

    // stop here if form is invalid
    if (this.registerForm.invalid) {
      return;
    }


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
