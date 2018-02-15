import java.util.Arrays;

public class MergeSort 
{
	public static String [] mergeSort(String [] list)
	{
		
		
		if (list.length==1) 
		{
			return list;
		}
		else 
		{
			int halfLength = list.length/2;
			String [] list2 = new String [halfLength];
			String [] list3 = new String [list.length-list2.length];
			
			list2 = Arrays.copyOfRange(list, 0, halfLength);
			list3 = Arrays.copyOfRange(list, list2.length+1, list.length);
			return (mergeSort(MergeAndPartition.Merge(list2, list3)));
		}
		
		
		
		
		
		
		
	}
}
