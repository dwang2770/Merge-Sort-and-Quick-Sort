// Dave Wang Merge And Quick Sort
// 2/9/18
public class Runner {

	public static void main(String[] args) 
	{
		//Test for Merge and Partition Helper Method
		String [] test1 = {"apple", "cucumber", "microsoft", "zorro"};
		String [] test2 = {"banna", "cherry", "mahogany", "oreos", "pinata"};
		int [] test3 = {3,4,2,7,12,22,0,1};
		
		long start = System.nanoTime();
		String[] list3 = MergeAndPartition.Merge(test1, test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge took: " + time + " nanoseconds");

		for (String x : list3)
		{
			System.out.print(x + ", ");
		}
		
		start = System.nanoTime();
		int pivotFinalPosition = MergeAndPartition.Partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition took: " + time + " nanoseconds");
		System.out.println("Final Piviot Position: " + pivotFinalPosition);
		
		for (int y : test3)
		{
			System.out.print(y + " ");
		}
	
		String [] test4 = {"b", "c", "f", "k", "a", "z",};
		MergeSort.mergeSort(test4);
		for (String z : test4)
		{
			System.out.print(z + ", ");
		}
	
	}

}
