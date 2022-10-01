import { Component, OnInit } from '@angular/core';
import { HardcodeAuthenticationService } from '../shared/hardcode-authentication.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  isUserLoggedIn : boolean=false;
  constructor(public hardcodeAuthenticationService:HardcodeAuthenticationService) { }

  ngOnInit() {
    this.isUserLoggedIn=this.hardcodeAuthenticationService.isUserLoggedIn();
  }

}
