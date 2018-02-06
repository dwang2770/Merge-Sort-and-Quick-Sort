
public class Runner {

	public static void main(String[] args) 
	{
		String [] list1 = {"a","e","f"};
		String [] list2 = {"b","c","d"};
		String [] list3 = MergeAndPartition.Merge(list1, list2);
		for (String x : list3)
		{
			System.out.print(x + ", ");
		}
	}

}
