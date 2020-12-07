class DrivingLicence 
{
	public static void main(String[] args) 
	{
		int age=12;
		if(age>=18)
		{
		System.out.println("Eligible for DL");
		}
		else
		{
			int lackAge=18-age;
			System.out.println("u r not eligible because u r age is lacking by " +lackAge+ "years");
		}
	}
}
