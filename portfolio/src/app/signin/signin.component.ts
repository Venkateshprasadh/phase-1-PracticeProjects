import { Component, OnInit } from '@angular/core';
import { SignupComponent } from '../signup/signup.component';
@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent {

  constructor() { }

  
  cemail:string='';
  cpassword:string='';
  show:boolean=false;

  checkemail(e:any)
  {
    this.cemail=e.target.value;
    
    
  }

 checkpassword(e:any)
  {
    this.cpassword=e.target.value;
    if(this.cemail && this.cpassword)
    {
      this.show=true;
      
    }
    return  this.cpassword;
  }
 
  
}
