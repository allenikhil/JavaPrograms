package containers;
import java.util.*;
public class BrandNameSort implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Car c1=(Car)o1;
		Car c2=(Car)o2;
		return c1.bn.compareTo(c2.bn);
	}

}
