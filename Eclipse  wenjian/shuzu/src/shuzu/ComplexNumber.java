package shuzu;

public class ComplexNumber {
	double real;
	double image;
	public ComplexNumber() {
		
	}
public ComplexNumber(double real,double image) {
		this.real=real;
		this.image=image;
	}
void Show() {
	if(image<0)
	System.out.println(real+""+image+"i");
	else
		System.out.println(real+"+"+image+"i");
	return;
}
public ComplexNumber add (ComplexNumber c) {
	ComplexNumber cc= new ComplexNumber();
	cc.real = this.real+c.real;
	cc.image = this.image+c.image;
	return cc;
}public ComplexNumber mutil (ComplexNumber c) {
	ComplexNumber cc= new ComplexNumber();
	cc.real = this.real*c.real- this.image*c.image;;
	cc.image =this.real*c.image+this.image*c.real;
	return cc;
}

}