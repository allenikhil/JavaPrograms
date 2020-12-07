package containers;
import java.util.*;
public class TopSpeedSort implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Car c1=(Car)o1;
		Car c2=(Car)o2;
		if(c1.ts>c2.ts)
		{
			return 1;
		}
		else if(c1.ts<c2.ts)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
