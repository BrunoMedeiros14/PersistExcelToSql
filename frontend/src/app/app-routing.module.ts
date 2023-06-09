import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InsertFormComponent } from './tasks/insert-form/insert-form.component';
import { ListComponent } from './tasks/list/list.component';
import { InsertSheetComponent } from './tasks/insert-sheet/insert-sheet.component';

const routes: Routes = [
  { path: '', component: ListComponent },
  { path: 'form', component: InsertFormComponent },
  { path: 'sheet', component: InsertSheetComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
