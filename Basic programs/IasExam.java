class IasExam 
{
	public static void main(String[] args) 
	{
		int age=17;
		if(age>=21 && age<=35)
		{
		System.out.println("Eligible for Ias exam ");
		}
		else
		{
			if(age<21)
			{
				int lackAge=21-age;
				System.out.println(" you are  lacking by " +lackAge +"years to take up Ias exam");
			}
			else
			{
				int excedAge=age-35;
				System.out.println("you are exced by " +excedAge +"years to take up Ias exam");
			}
	}
}
}