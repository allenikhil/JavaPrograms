class  Car
{
	String bn;
	int tp;
	double ml,cp;
	Car(String bn,int tp,double ml,double cp)
	{
		this.bn=bn;
		this.tp=tp;
		this.ml=ml;
		this.cp=cp;
	}
   Car(Car c1,Car c2,Car c3,Car c4)
	{
		this.bn=c1.bn;
		this.tp=c2.tp;
		this.ml=c3.ml;
		this.cp=c4.cp;
	}
	public void printCarInformation()
	{
		System.out.println("=======");
		System.out.println("Car brand name:"+bn);
		System.out.println("Car top speed :"+tp);
		System.out.println("Car mileage:"+ml);
		System.out.println("Car price:"+cp);
	}
}
class Cardetails
{
	public static void main(String[] args) 
	{
		Car r1= new Car("benz",200,20.0,100000);
		Car r2= new Car("ferrai",250,18.0,200000);
        Car r3= new Car("audi",300,15.0,300000);
		Car r4= new Car("bugatti",350,10.0,500000);
		Car r5= new Car(r4,r4,r4,r4);
		Car r6= new Car(r1,r1,r2,r2);
		Car r7= new Car(r1,r2,r3,r4);
		r1.printCarInformation();
		r2.printCarInformation();
		r3.printCarInformation();
		r4.printCarInformation();
		r5.printCarInformation();
        r6.printCarInformation();
        r7.printCarInformation();
	}
}
