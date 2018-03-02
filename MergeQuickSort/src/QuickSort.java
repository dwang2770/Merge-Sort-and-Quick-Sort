//Dave Wang
//2/25/18(completed)
public class QuickSort 
{
	public static void quickSort(int arr[], int low, int high)
	 {
	     if (low < high)
	     {
	         int pivot = MergeAndPartition.partition2(arr, low, high);
	         
	         quickSort(arr, low, pivot-1);
	         quickSort(arr, pivot+1, high);
	     }
	 }
}
