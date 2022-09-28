import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent  {

 
  constructor(private router:Router) { }

 
  show:boolean=false;
  remail:any='';
  goto:any='';
  updateemail(e:any)
  {
    this.remail= e.target.value;
    
    return  this.remail;
  }
  rpassword:string='';
  updatepwd(e:any)
  {
    this.rpassword=e.target.value;
    
    if(this.remail && this.rpassword)
    {
      this.show=true;
    }
    return  this.rpassword;

  }
  
 }
