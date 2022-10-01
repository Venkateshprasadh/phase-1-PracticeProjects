import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup} from "@angular/forms";
import { ApiService } from '../shared/api.service';
import { EmployeeModel } from "./employee-dash board.model"
import { FormControl } from '@angular/forms';


@Component({
  selector: 'app-employee-dashboard',
  templateUrl: './employee-dashboard.component.html',
  styleUrls: ['./employee-dashboard.component.css']
})
export class EmployeeDashboardComponent implements OnInit {

  showid='';
  showfname='';
  showlname='';
  showemail='';
  formValue !: FormGroup;
  searchId = new FormControl();
  employeeModelObj: EmployeeModel = new EmployeeModel();
  employeeData ! :any;
  showAdd !: boolean;
  showUpdate !: boolean;
  showsearch !:boolean;
  private err: any;
  data: any;
  constructor(private formBuilder: FormBuilder,private api :ApiService) { }

  ngOnInit() {
    

    this.formValue =  this.formBuilder.group({
      firstName: [''],
      lastName: [''],
      email:[''],
      // mobile:[''],
      // salary:['']
    });
    
    this.getAllEmployee();
    
  }
  clickAddEmployee(){
    this.formValue.reset();
    this.showAdd=true;
    this.showUpdate=false;
    this.showsearch=false;
  }

  postEmployeeDetails() {
    
    this.employeeModelObj.firstName = this.formValue.value.firstName;
    this.employeeModelObj.lastName  = this.formValue.value.lastName;
    this.employeeModelObj.email     = this.formValue.value.email;
    // this.employeeModelObj.mobile    = this.formValue.value.mobile;
    // this.employeeModelObj.salary    = this.formValue.value.salary;
    this.api.postEmployee(this.employeeModelObj)
     .subscribe((res: any)=>{
      console.log(res);
      alert("Employee Added Successfully");
      let ref=document.getElementById("cancel")
      ref?.click();
      this.formValue.reset();
      this.getAllEmployee();
    },
      (      err: any) => {
      alert("Something went wrong");
    });
  }
  getAllEmployee(){
    this.api.getEmployee()
    .subscribe(res=>{
      this.employeeData=res;
    })

  }
  getEmployeeId(searchId :any){
    this.getAllEmployee();
    console.log(searchId.value)
   this.api.getId(searchId.value)
    .subscribe(data=>{
      this.showsearch=true;
      this.showAdd=false;
      this.showUpdate=false;
      
      this.data=data;
      console.log(this.data)
    //   this.showid=this.employeeData.id;
    // this.showfname=this.employeeData.firstName;
    // this.showlname=this.employeeData.lastName;
    // this.showemail=this.employeeData.showemail;
    // console.log(this.showfname);
    } );this.getAllEmployee();
    
    //this.onEdit(this.employeeData)
    // this.showAdd=false;
    // this.showUpdate=true;
    // this.employeeModelObj.id=this.employeeData.id;
    // this.showAdd=false;
    // this.showUpdate=true;
    // this.employeeModelObj.id=this.employeeData.id;
    // this.formValue.controls['firstName'].setValue(this.employeeData.firstName)
    // this.formValue.controls['lastName'].setValue(this.employeeData.lastName)
    // this.formValue.controls['email'].setValue(this.employeeData.email)
    // this.formValue.controls['mobile'].setValue(searchId.value.mobile)
    // this.formValue.controls['salary'].setValue(searchId.value.salary)
    // this.getAllEmployee();
    //  this.onEdit(searchId);
  }
  deleteEmployee(row :any){
    console.log(row.id)
    this.api.deleteEmployee(row.id)
    .subscribe(res=>{
      alert("Employee Deleted")
      this.getAllEmployee();
    });location.reload()
    this.showsearch=false;
      this.showAdd=false;
      this.showUpdate=false;
  }
  onEdit(row : any)
  {
    this.showsearch=false;
    this.showAdd=false;
    this.showUpdate=true;
    this.employeeModelObj.id=row.id;
    this.formValue.controls['firstName'].setValue(row.firstName)
    this.formValue.controls['lastName'].setValue(row.lastName)
    this.formValue.controls['email'].setValue(row.email)
    // this.formValue.controls['mobile'].setValue(row.mobile)
    // this.formValue.controls['salary'].setValue(row.salary)
    this.getAllEmployee();
   }
   updateEmployeeDetails(){
    this.employeeModelObj.firstName = this.formValue.value.firstName;
    this.employeeModelObj.lastName  = this.formValue.value.lastName;
    this.employeeModelObj.email     = this.formValue.value.email;
    // this.employeeModelObj.mobile    = this.formValue.value.mobile;
    // this.employeeModelObj.salary    = this.formValue.value.salary;
    this.api.updateEmployee(this.employeeModelObj,this.employeeModelObj.id)
    .subscribe(res=>{
      alert("updated succesfully");
      location.reload()
      let ref=document.getElementById("cancel")
      ref?.click();
      this.formValue.reset();
      this.getAllEmployee();
    })

   }
}
