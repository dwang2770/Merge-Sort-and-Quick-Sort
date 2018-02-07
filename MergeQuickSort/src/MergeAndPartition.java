
public class MergeAndPartition 
{
	public static String[] Merge (String [] list1, String [] list2)
	{
		String [] list3 = new String [list1.length + list2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < list1.length && j < list2.length && k < list3.length)
		{
			
			if (list1[i].compareTo(list2[j]) <= 0)
			{
				list3[k] = list1[i];
				i++;
				k++;
			}
			
			else if (list1[i].compareTo(list2[j]) > 0)
			{
				list3[k] = list2[j];
				j++;
				k++;
			}
		
	
		}
		
		if (j == list2.length)
		{
			for (int x = i; x < list1.length; x++)
			{
				list3[k] = list1[x];
				k++;
			}
		}
		
		if (i == list1.length)
		{
			for (int y = j; y < list2.length; y++)
			{
				list3[k] = list1[y];
				k++;
			}
		}
		
		return list3;
	}
	
	public static int Partition(int [] list)
	{
		int pivot = list[0];
		
		for (int x : list)
		{
			
		}
	}
}