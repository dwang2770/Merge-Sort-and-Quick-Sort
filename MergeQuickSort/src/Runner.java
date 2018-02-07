
public class Runner {

	public static void main(String[] args) 
	{
		String [] list1 = {"a","c","e"};
		String [] list2 = {"b","d","f"};
		String [] list3 = MergeAndPartition.Merge(list1, list2);
		for (String x : list3)
		{
			System.out.print(x + ", ");
		}
	}

}
