/*
 * @autor 		James Niro
 * @version     1.0              
 * @since       1.0
 * @date 		03/27/2018
 * 				Insertion Sort Alogrithm
 */


public class InsertionSort {
	
	/*	insertion sort method
	 * @param takes int array
	 */
	void insertionSort(int[] A)
	{	
		for(int i  = 2; i < A.length; i++)	// for loop to go over the array
		{
			int key = A[i]; 				// assigning key to A[i] value at index 2 initially 
			int j = i -1;					// J s initital index will be 1
			// running while loop to check for values if j < 0 && A[j] < key it will not execute the while loop
			while(j > 0 && A[j] > key)		
			{
				A[j+ 1] = A[j];				// assigning A[j]  to A[j + 1] 
				j = j -1;					// decrementing j
				
			}
			A[j + 1] = key;					// when while loop is done key gets assigned to A[j + 1]
		}
	}

}
