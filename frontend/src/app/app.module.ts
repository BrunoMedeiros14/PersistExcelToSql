import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './tasks/list/list.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { InsertFormComponent } from './tasks/insert-form/insert-form.component';
import { InsertSheetComponent } from './tasks/insert-sheet/insert-sheet.component';

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    InsertFormComponent,
    InsertSheetComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
