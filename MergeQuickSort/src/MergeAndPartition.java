
public class MergeAndPartition 
{
	public static int[] Merge (int [] list1, int[]list2)
	{
		int [] list3 = new int[list1.length + list2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		int counter=0;
		int indexOfList2 = 0;
		while (i < list1.length)
		{
			if (list1[i] < list2[j])
			{
				list3[k] = list1[i];
				k++;
				counter++;
			}
			if (list1[i] > list2[j])
			{
				list3[k] = list2[j];
				k++;
				j++;
				i--;
				counter++;
				indexOfList2++;
			}
		
		i++;
		}
		
		for (indexOfList2; indexOfList2 < List2.length; indexOfList2++)
		{
			list3[counter] = list2[indexOfList2];
		}
		
	return list3;
	}
}
