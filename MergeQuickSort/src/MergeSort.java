//Dave Wang
//2/25/18(completed)
import java.util.Arrays;

public class MergeSort 
{
	public static String [] mergeSorts(String [] list)
	{
		
		//once the array is split to length one, we simply return the array
		if (list.length==1) 
		{
			return list;
		}
		//we split the array in half as indicated by list2 and list 3
		//we then continue to split them until length is one then we merge them back together
		else 
		{
			String [] list2 = Arrays.copyOfRange(list, 0, list.length/2);
			String [] list3 = Arrays.copyOfRange(list, list.length/2, list.length);
			return (MergeAndPartition.Merge(mergeSorts(list2), mergeSorts(list3)));
		}
		
		
		
		
		
		
		
	}
}
