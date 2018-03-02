// Dave Wang Merge And Partition helper method
// 2/9/18
public class MergeAndPartition 
{
	public static String[] Merge (String [] list1, String [] list2)
	{
		String [] list3 = new String [list1.length + list2.length];
		int i = 0;//tracks index of list1
		int j = 0;//tracks index of list2
		int k = 0;//tracks index of list3
		
		//this while loop continues until one of the indexes reaches the length of its corresponding array
		while ( i < list1.length && j < list2.length && k < list3.length)
		{
			//if the string at list1 is less than that of list2, it will be the value of list3[k]
			//we then increment i
			if (list1[i].compareTo(list2[j]) <= 0)
			{
				list3[k] = list1[i];
				i++;
				
			}
			//if the string at list2 is less than that of list1, it will be the value of list3[k]
			//we then increment j
			else if (list1[i].compareTo(list2[j]) > 0)
			{
				list3[k] = list2[j];
				j++;
			
			}
			//after every condition we want to increment k so list3 can continue getting filled
			k++;
		}
		
		//once one of the indexes reach the length of its array, we know that there is nothing left to merge for the first array
		//thus we just fill list3 with the values of the remaining array
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
			//if the value at i is less than the pivot you can just swap them to make the smaller value go left
			if (list[i] <= pivot)
			{
				intSwap(list, i , i-1);
				indexBase = i;
			}
			//if the value is greater than the pivot value then we swap that value with the last value 
			//we then make last-- so we don't swap the same position again
			//i is also incremented down so we dont skip the number that was swapped for list[i]
			else if (list[i] > pivot && last > i)
			{
				intSwap(list, i, last);
				last--;
				i--;
			}
		}
		return indexBase;
	}
	//Dave Wang
	//2/25/18(completed)
	//partition used for quick sort (lab 3.3)
	//source: geeksforgeeks
	public static int partition2(int [] list, int front, int back)
    {
        //pivot is the last number
		int pivot = list[back]; 
		// index of smaller element
		int i = (front - 1); 
        //for loop that goes through the whole array
        for (int j=front; j<back; j++)
        {
            /* If list[j] is smaller than or equal to pivot swap arr[i] and arr[j]
               example arry nums = {1,5,2,3}
               
               in this case j will be 1 and i will be -1
               since 1 is less than 3 we will swap 1 with int at position i(0; which is int 1)
               
               after we check that 5 is greater than 3 and we do nothing
               we then check that 2 is less that 3, at this moment i is now 1(0 + 1) and we will swap 2 with position 1(int 5)
               
               after this we are at int 3 which is the last number in the array and ends the for loop
            */
            if (list[j] <= pivot)
            {
                i++;
               intSwap(list,i,j);
            }
        }
        /*
         * after all that sorting we are guaranteed that all the ints smaller than the pivot is before position i and i itself
         * so at the very end we will swap the pivot(arr[back]) with the int at position i +1
         */
       intSwap(list,i+1,back );
       //returns i+1 because i is always 1 less than the index due to front -1
        return i+1;
    }
	
	//swap helper method
	public static void intSwap (int [] arr, int index1, int index2)
	{
		int y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}
}