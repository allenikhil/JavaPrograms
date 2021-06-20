
public class CompareTwoStringsReplacedOrInsertedOrRemoved {

	public static void main(String[] args) {

		//Checking one string other if one string is reomved,inserted,replaced one character with other string
		//example 1)pale,ple--> True(one characte removed) 2)pale,bale --> True(one characte replaced) 
		// 3)1)ple,pale--> True(one characte inserted) so comparting removed and inserted are same
		
		System.out.println(oneEditAway("pale","ple"));
		System.out.println(oneEditAway("pale","bale"));
		System.out.println(oneEditAway("ple","pale"));
		System.out.println(oneEditAway("pale","hdle"));
		
	}
	public static boolean oneEditAway(String first,String second)
	{
		if(first.length()==second.length())
		{
			return oneEdiReplace(first, second);
		}else if(first.length()+1==second.length()) 
		{
			return oneEditInsert(first, second);
		}
		else if(first.length()-1==second.length()) 
		{
			return oneEditInsert(second, first);
		}
		return false;
	}

	public static boolean oneEdiReplace(String s1,String s2)
	{
		boolean foundDiffrence=false;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				if(foundDiffrence)
				{
				return false;
				}
				foundDiffrence=true;
			}
		}
		return true;
	}
	
	//check if you can insert a character into s1 to make s2.
	public static boolean oneEditInsert(String s1,String s2)
	{
		int index1=0;
		int index2=0;
		while (index2<s2.length() && index1<s1.length()) {
			if(s1.charAt(index1)!=s2.charAt(index2)) {
				if(index1!=index2)
				{
					return false;
				}
				index2++;
			}
			else
			{
				index1++;
				index2++;
			}
		}
		return true;
	}
}
