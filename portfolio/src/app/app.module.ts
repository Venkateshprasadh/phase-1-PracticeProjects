import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './signup/signup.component';
import { SigninComponent } from './signin/signin.component';
import { LanderComponent } from './lander/lander.component';
import { RouterModule,Routes } from '@angular/router';
import { HeaderComponent } from './header/header.component';

const routes: Routes = [
  {path:'',component:SignupComponent},
  {path:'signup',component:SignupComponent},
  {path:'signin',component:SigninComponent},
  {path:'lander',component:LanderComponent}
  ];
  
@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    SigninComponent,
    LanderComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes)

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
