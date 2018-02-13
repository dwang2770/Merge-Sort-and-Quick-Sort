
public class MergeSort 
{
	public static String [] mergeSort(String [] list)
	{
		if (list.length==1) 
		{
			return list;
		}
		int halfLength = list.length/2;
		String [] list2 = new String [halfLength];
		
		for (int x = 0; x < list2.length; x++)
		{
			list2[x] = list[x];
		}
	
		if (halfLength*2 != list.length)
		{
			String [] list3 = new String[halfLength + 1];
			
			for (int y = halfLength+1; y < list.length; y++)
			{
				list3[y] = list[y];
			}
			
			list = new String[halfLength+1];
			for (int z = halfLength+1; z < list.length; z++)
			{
				list[z] = list3[z];
			}
		}
		else if (halfLength*2 == list.length)
		{
			String [] list3 = new String[halfLength];
			
			for (int y = halfLength+1; y < list.length; y++)
			{
				list3[y] = list[y];
			}
			
			list = new String[halfLength+1];
			for (int z = halfLength+1; z < list.length; z++)
			{
				list[z] = list3[z];
			}
		}
		
		return (mergeSort(MergeAndPartition.Merge(list2, list)));
		
	}
}
