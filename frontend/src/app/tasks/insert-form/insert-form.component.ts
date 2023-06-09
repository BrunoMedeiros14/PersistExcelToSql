import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Participant } from '../shared/participant';
import { Router } from '@angular/router';

@Component({
  selector: 'app-insert-form',
  templateUrl: './insert-form.component.html',
  styleUrls: ['./insert-form.component.css'],
})
export class InsertFormComponent {
  urlToUpload: string = `${environment.apiUrl}`;
  participant: Participant = new Participant();

  constructor(private _http: HttpClient, private router: Router) {}

  onSubmit(e: any) {
    console.log(e);
    this._http.post(this.urlToUpload, this.participant).subscribe({
      next: (data: any) => {
        alert(data.message);
        this.router.navigate(['']);
      },
      error: (data: any) =>
        alert('Erro ao preencher o formulário, tente novamente.'),
    });
  }
}
