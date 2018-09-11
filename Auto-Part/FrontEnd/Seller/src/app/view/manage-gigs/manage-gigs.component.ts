import { Component, OnInit } from '@angular/core';
import {ImageUploardService} from "../../services/image-uploard.service";

@Component({
  selector: 'app-manage-gigs',
  templateUrl: './manage-gigs.component.html',
  styleUrls: ['./manage-gigs.component.css']
})
export class ManageGigsComponent implements OnInit {

  file:File;
  constructor(private uploadServive:ImageUploardService) { }

  ngOnInit() {
  }

  setImage(event){
    const newfile=event.target.files[0];
    console.log("hdghf")
    this.file=newfile;
  }

  addImage():void{
    console.log("hgdhfs")
    const  formData:FormData=new FormData();
    formData.append("file",this.file);
    console.log(this.file)
    this.uploadServive.singleFileUpload(formData).subscribe(
      (result)=>{
        if(result){
          alert("Sucsess")
        }
      }
    )
  }
}
