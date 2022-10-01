  import { Injectable } from '@angular/core';

  @Injectable({
    providedIn: 'root'
  })
  export class HardcodeAuthenticationService {

    constructor() { }
    newpass='admin';
    authenticate(username: string,password: string){
      //console.log('before'+this.isUserLoggedIn());
      if(username==='admin'&& password===this.newpass)
      {
        sessionStorage.setItem('authenticateUser',username)
      // console.log('after'+this.isUserLoggedIn());
        return true;
      }
    else{
      return false;
    }
    }
    isUserLoggedIn(){
      let user=sessionStorage.getItem('authenticateUser');
      return !(user===null)
    }
    logout()
    {
      sessionStorage.removeItem('authenticateUser');
    }
  }
