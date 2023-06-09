import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './tasks/list/list.component';
import { InsertFormComponent } from './tasks/insert-form/insert-form.component';
import { InsertSheetComponent } from './tasks/insert-sheet/insert-sheet.component';

@NgModule({
  declarations: [AppComponent, ListComponent, InsertFormComponent, InsertSheetComponent],
  imports: [BrowserModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
