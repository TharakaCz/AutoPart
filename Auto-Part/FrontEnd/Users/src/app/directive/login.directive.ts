import {Directive, ElementRef, HostListener} from '@angular/core';

@Directive({
  selector: '[appLogin]'
})
export class LoginDirective {

  constructor(private elm:ElementRef) { }

  @HostListener("mouseenter")setColorOnMouseEnter(){
    this.elm.nativeElement.style.color = "Yellow";
    this.elm.nativeElement.style.cursor ="pointer";
    this.elm.nativeElement.style.fontSize = "45px";
  }

  @HostListener("mouseleave")setColorMouseLeave(){
    this.elm.nativeElement.style.color = "Black";
    this.elm.nativeElement.style.fontSize = "40px";
  }

}
