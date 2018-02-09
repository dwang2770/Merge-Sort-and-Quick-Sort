
public class MergeAndPartition 
{
	public static String[] Merge (String [] list1, String [] list2)
	{
		String [] list3 = new String [list1.length + list2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while ( i < list1.length && j < list2.length && k < list3.length)
		{
			
			if (list1[i].compareTo(list2[j]) <= 0)
			{
				list3[k] = list1[i];
				i++;
				
			}
			
			else if (list1[i].compareTo(list2[j]) > 0)
			{
				list3[k] = list2[j];
				j++;
			
			}
		
			k++;
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
				list3[k] = list2[y];
				k++;
			}
		}
		
		return list3;
	}
	
	public static int Partition (int [] list)
	{
		int indexBase = 0;
		int pivot = list[indexBase];
		int last = list.length-1;
		for (int i = 1; i < list.length; i++)
		{
			if (list[i] <= pivot)
			{
				intSwap(list, i , i-1);
				indexBase = i;
			}
			
			else if (list[i] > pivot && last > i)
			{
				intSwap(list, i, last);
				last--;
				i--;
			}
		}
		return indexBase;
	}

	public static void intSwap (int [] arr, int index1, int index2)
	{
		int y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}
}