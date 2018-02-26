import java.util.Arrays;

public class MergeSort 
{
	public static String [] mergeSorts(String [] list)
	{
		
		
		if (list.length==1) 
		{
			return list;
		}
		else 
		{
			String [] list2 = Arrays.copyOfRange(list, 0, list.length/2);
			String [] list3 = Arrays.copyOfRange(list, list.length/2, list.length);
			return (MergeAndPartition.Merge(mergeSorts(list2), mergeSorts(list3)));
		}
		
		
		
		
		
		
		
	}
}
