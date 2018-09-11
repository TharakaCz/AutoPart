import {Directive, ElementRef, HostListener} from '@angular/core';

@Directive({
  selector: '[appNav]'
})
export class NavDirective {

  constructor(private elm:ElementRef) {

  }

  @HostListener("mouseenter")setColorOnMouseEnter(){
    this.elm.nativeElement.style.color="blue";
  }

  @HostListener("mouseleave")setColorOnMouseLeave(){
    this.elm.nativeElement.style.color="white";
  }
}
