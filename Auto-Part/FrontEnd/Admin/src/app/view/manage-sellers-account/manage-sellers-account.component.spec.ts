import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManageSellersAccountComponent } from './manage-sellers-account.component';

describe('ManageSellersAccountComponent', () => {
  let component: ManageSellersAccountComponent;
  let fixture: ComponentFixture<ManageSellersAccountComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManageSellersAccountComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManageSellersAccountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
