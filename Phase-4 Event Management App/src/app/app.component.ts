import { Component } from '@angular/core';
import {FormBuilder,FormGroup} from '@angular/forms'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AngularCRUD';
  formValue !:FormGroup;
  constructor(private formbuilder:FormBuilder) { }

  ngOnInit(): void {
    this.formValue=this.formbuilder.group({
      firstName :[''],
      lastName :[''],
      email :[''],
      mobile: [''],
      salary: ['']

    })
  }
}
