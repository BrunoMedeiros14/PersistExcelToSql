import { Participant } from './../shared/participant';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css'],
})
export class ListComponent {
  urlToUpload: string = 'http://localhost:8080/api/v1/participants';
  participants: Participant[] = [];

  constructor(private _http: HttpClient) {}

  ngOnInit(): void {
    this._http.get(this.urlToUpload).subscribe({
      next: (data: any) => (this.participants = data),
      error: (data: any) => console.log(data),
    });
  }
}
