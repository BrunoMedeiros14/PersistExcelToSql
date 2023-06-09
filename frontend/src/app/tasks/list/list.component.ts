import { Participant } from './../shared/participant';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css'],
})
export class ListComponent {
  urlToUpload: string = `${environment.apiUrl}`;
  participants: Participant[] = [];

  constructor(private _http: HttpClient) {}

  ngOnInit(): void {
    this._http.get(this.urlToUpload).subscribe({
      next: (data: any) => (this.participants = data),
      error: (data: any) => console.log(data),
    });
  }

  getFile() {
    this._http
      .get(`${this.urlToUpload}/spreadsheet`, { responseType: 'blob' })
      .subscribe({
        next: (sheet: any) => {
          const url = window.URL.createObjectURL(sheet);
          const link = document.createElement('a');
          link.href = url;
          link.download = 'planilha.xlsx';
          link.click();
          window.URL.revokeObjectURL(url);
        },
        error: (data) => console.log(data),
      });
  }
}
