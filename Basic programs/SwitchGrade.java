class SwitchGrade 
{
	public static void main(String[] args) 
	{
		char grade='a';
		switch(grade)
		{

		case 'A': System.out.println("1st rank");
					break;
		case 'B': System.out.println("2nd rank");
		           break;
		case 'C': System.out.println("1st class");
		          break;
		case 'D': System.out.println("2nd class");
					break;
		case 'E': System.out.println("fail");
					break;
					default: System.out.println("invalid grade");
		}
	}
}
