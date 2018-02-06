
public class MergeAndPartition 
{
	public static String[] Merge (String [] list1, String [] list2)
	{
		String [] list3 = new String [list1.length + list2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < list1.length && j < list2.length)
		{
			
			if (list1[i].compareTo(list2[j]) < 0)
			{
				list3[k] = list1[i];
				i++;
				k++;
			}
			
			if (list1[i].compareTo(list2[j]) > 0)
			{
				list3[k] = list2[j];
				j++;
				k++;
			}
		
	
		}
		
	
		
		return list3;
	}
}