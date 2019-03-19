package javaexamples;

public class Demo {
   String brandname;
   double topSpeed;
   double mileage;
   int carPrice;
   Demo(String bn,double ts,double mi,int cp)
   {
	   brandname=bn;
	   topSpeed=ts;
	  mileage=mi;
	  carPrice=cp;
   }
   Demo(Demo ref)
   {
	  this.brandname=ref.brandname;
	  this.topSpeed=ref.topSpeed;
	  this.mileage=ref.mileage;
	  this.carPrice=ref.carPrice;
   }
   Demo(Demo ref1,Demo ref2)
   {
		  this.brandname=ref1.brandname;
		  this.topSpeed=ref1.topSpeed;
		  this.mileage=ref2.mileage;
		  this.carPrice=ref2.carPrice;
   }
   Demo(Demo ref1,Demo ref2,Demo ref3,Demo ref4){
		  this.brandname=ref1.brandname;
		  this.topSpeed=ref2.topSpeed;
		  this.mileage=ref3.mileage;
		  this.carPrice=ref4.carPrice;
}
   
      public void display()
      {
	   System.out.println("the brandnameis"+brandname);
	   System.out.println("the top speed is"+topSpeed);
	   System.out.println("mileage is"+mileage);
	   System.out.println("carPrice"+carPrice);   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d1=new Demo("audi",100.30,30,150);

Demo d2=new Demo("bmw",120.10,50,200);
Demo d3=new Demo("ferrari",130.10,20,300);
Demo d4=new Demo("auto",50,30,50);
/*d1.display();
d2.display();
d3.display();
d4.display();*/

Demo d5=new Demo(d4);
//d5.display();

Demo d6=new Demo(d1,d2);
//d6.display();
Demo d7=new Demo(d1,d2,d3,d4);
d7.display();
	}
}
