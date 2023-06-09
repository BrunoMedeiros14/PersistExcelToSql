import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-insert-sheet',
  templateUrl: './insert-sheet.component.html',
  styleUrls: ['./insert-sheet.component.css'],
})
export class InsertSheetComponent {
  imagePath: string = 'assets/images/example.png';
  urlToUpload: string = `${environment.apiUrl}/spreadsheet`;

  constructor(private _http: HttpClient) {}

  ngOnInit(): void {}

  file: any;

  selectFile(event: any) {
    this.file = event.target.files[0];
  }

  uploadFile() {
    let formData = new FormData();
    formData.append('spreadSheet', this.file);

    this._http.post(this.urlToUpload, formData).subscribe({
      next: (data: any) => alert(data.message),
      error: (data: any) => alert(data),
    });
  }
}
