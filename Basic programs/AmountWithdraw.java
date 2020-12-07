class AmountWithdraw 
{
	public static void main(String[] args) 
	{
		double bal=50000.20;
		int amt=4500;
		if(amt<=bal)
		{
		System.out.println("you have withdraw "+amt +"rs");
		bal-=amt;
	    }
		else
		{
			System.out.println("Insuffciant balance");
		}
		System.out.println(" ur current bal is "+bal +"rs");
	}
}
