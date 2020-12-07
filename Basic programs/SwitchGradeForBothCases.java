class SwitchGradeForBothCases 
{
	public static void main(String[] args) 
	{
		char grade='B';
		switch(grade)
		{
         case 'A':
		 case 'a': System.out.println("1st rank");
				    break;
         case 'B':
		 case 'b': System.out.println("2nd rank");
		           break;
        case 'c':
		case 'C': System.out.println("1st class");
		          break;
        case 'd':
		case 'D': System.out.println("2nd class");
					break;
        case 'e':
		case 'E': System.out.println("fail");
					break;
					default: System.out.println("invalid grade");
		}
	}
}
