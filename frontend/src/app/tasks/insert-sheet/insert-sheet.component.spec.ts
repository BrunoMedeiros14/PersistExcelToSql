import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InsertSheetComponent } from './insert-sheet.component';

describe('InsertSheetComponent', () => {
  let component: InsertSheetComponent;
  let fixture: ComponentFixture<InsertSheetComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [InsertSheetComponent]
    });
    fixture = TestBed.createComponent(InsertSheetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
