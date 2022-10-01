import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { map } from "rxjs/operators";
import { EmployeeModel } from '../employee-dashboard/employee-dash board.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }

  postEmployee(data: any){
    return this.http.post<any>("http://localhost:3000/employees", data)
    .pipe(map((res:any) => {
      return res;
    }));
  }
  getEmployee(){
    return this.http.get<any>("http://localhost:3000/employees")
    .pipe(map((res:any) => {
      return res;
    }));
  }
  updateEmployee(data: any, id: number){
    return this.http.put<any>("http://localhost:3000/employees/"+id, data)
    .pipe(map((res:any) => {
      return res;
    }));
  }
  deleteEmployee(id: number){
    return this.http.delete<any>("http://localhost:3000/employees/"+id)
    .pipe(map((res:any) => {
      return res;
    }));
  }
  // getEmployeeById( id: number){
  //   return this.http.get<any>("http://localhost:3000/employees/"+id)
  //   .pipe(map((res:any) => {
  //     return res;
  //   }));
  // }
  getId(id: number): Observable<EmployeeModel> {
    const url = "http://localhost:3000/employees/"+id;
    return this.http.get<EmployeeModel>(url)
      .pipe(map((res:any) => {
        return res;
      
      }));
    }
}
