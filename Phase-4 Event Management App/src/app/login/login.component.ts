import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { HardcodeAuthenticationService } from '../shared/hardcode-authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username='';
  password='';

  errormsg="Invalid Credentials";
  invalidlogin=false;
  showpasswordform=false;
  showloginform=true;
  
  constructor(private router : Router,  private hardcodeAuthenticationService :HardcodeAuthenticationService) { }

  ngOnInit(): void {
  }
  handlelogin()
{
 // console.log(this.username);
//  console.log(this.password);


 //if(this.username ==='admin' && this.password === 'admin'){
   if(this.hardcodeAuthenticationService.authenticate(this.username,this.password)){ 
  //redirect,,,
    this.router.navigate(['employees']);
    this.invalidlogin=false;
  }
  else{
    this.invalidlogin=true;
  }

}
changepassword(){
  const npassword = prompt(('new password'));
const cpassword = prompt('Confirm password');
const changedsuccesfully = confirm(' password changed succesfully');
console.log(npassword)
this.showloginform=false;
this.showpasswordform=true;
}
}


