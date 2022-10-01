import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeDashboardComponent } from './employee-dashboard/employee-dashboard.component';
import { ErrorComponent } from './error/error.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { RouterGaurdService } from './shared/router-gaurd.service';


const routes: Routes = [

  {path:'employees',component:EmployeeDashboardComponent,canActivate :[RouterGaurdService]},
  {path:'',component:LoginComponent},
  {path:'login',component:LoginComponent},
  {path:'logout',component:LogoutComponent,canActivate :[RouterGaurdService]},
  {path:'**',component:ErrorComponent,canActivate :[RouterGaurdService]},
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
