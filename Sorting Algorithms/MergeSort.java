/*
 * @autor 		James Niro
 * @version     1.0              
 * @since       1.0
 * @date 		04/02/2018
 * 				MergeSort Alogrithm
 */

// class name
public class MergeSort {
	
/*	this method takes array as input and sorts it the array
 * @param	arr		takes array 
 * @param 	l		left side of the array
 * @param	r		right side of the array
 * @param	m		middle of the array
 * @return void	
 */
void Merge(int[] arr, int l, int m, int r)
{
	// n1 equals the lenght of the left subarray
	int n1 = m - l + 1;
	// n2 equals the length of right subarray
	int n2 = r - m;
	// L equals left subarray
	int[] L = new int[n1 + 1];
	// R equals Right subbaray
	int[] R = new int[n2 + 1];
	
	// for loop to assign left array to left temp array
	for(int i = 0; i < n1; i++)
	{
		L[i] = arr[l + i];
	}
	// for loop to assign Right array to Right temp array
	for(int j = 0; j < n2; j++)
	{
		R[j] = arr[m + j + 1];
	}

	L[n1] = Integer.MAX_VALUE;// assigning left subbarry max value
	R[n2] = Integer.MAX_VALUE;// assigning rigth subbarry max value
	
	
	int i = 0; int j = 0;
	for(int k = l; k <= r; k++){
		if(L[i] <= R[j]){
			arr[k] = L[i];
			i++;
		}else{
			arr[k] = R[j];
			j++;
		}
	}
	
	
}


/*
 * 	This method calls the array recursively and sorts the array
 * @param arr 	takes integer array
 * @param l		left side of the array
 * @param r		right side of the array
 */
void sort(int[] arr, int l, int r)
{
	if(l < r){
		int q = (l + r) /2;
		sort(arr, l, q);
		sort(arr,  q + 1, r);
		Merge(arr, l, q, r);
	}
}



}
