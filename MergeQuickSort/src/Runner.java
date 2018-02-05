
public class Runner {

	public static void main(String[] args) 
	{
		int [] list1 = {3,4,5};
		int [] list2 = {2,6,7};
		int [] list3 = MergeAndPartition.Merge(list1, list2);
		for (int x : list3)
		{
			System.out.print(x + ", ");
		}
	}

}
