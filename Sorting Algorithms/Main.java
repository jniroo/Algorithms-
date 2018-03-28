/*
 * @autor 		James Niro
 * @version     1.0              
 * @since       1.0
 * @date 		03/27/2018
 * 				Insertion Sort Alogrithm
 */


public class Main {
	
	/*
	 * Method to print the array
	 * @param int array
	 */
	  static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	
	// main method
	public static void main(String[] args){
		// integer array with 50 element
		int[] arr = new int[50];
		// for loop to fill the array with random numbers
		for(int i = 1; i < arr.length; i++)
		{
			arr[i] = (int) (Math.random() * 50); 
		}
 		// initiliazing new clas object sort
		InsertionSort sort = new InsertionSort();
		// printing the array before sort 
		System.out.println("Before Insertion Sort");
		printArray(arr);
		// sorting the arrya
		sort.insertionSort(arr);
		System.out.println("After Insertion Sort");
		printArray(arr);
		
	
		
	}
}
