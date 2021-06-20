
public class PermutationsOfTwoStrings {

	public static void main(String[] args) {
String s1="god";
String s2="dog";
System.out.println(permutation(s1, s2));
	}
	public static String ownSort(String s)
	{
		char[]content=s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	public static boolean permutation(String s,String t)
	{
		if(s.length()!=t.length())
		{
			return false;
		}
		return ownSort(s).equals(ownSort(t));
	}

}
