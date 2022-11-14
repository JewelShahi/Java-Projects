import java.util.*;
public class EvenNumDontSort {
	
	// hard but ok way
	public static int[] sortArray(int[] arr) {
		ArrayList<Integer> a = new ArrayList<>(); // for saving the odd numbers
		ArrayList<Integer> evenNum = new ArrayList<>(); // for saving the even numbers
		ArrayList<Integer> index = new ArrayList<>(); // for saving the even numbers' indexes

		for(int i=0; i<arr.length; i++){
      	if(arr[i]%2!=0){
       		a.add(arr[i]); // adding odd numbers in the arraylist
      	}else{
     			evenNum.add(arr[i]); // adding even number in the arraylist
        	index.add(i); // adding the index of the even numbers in the arraylist
      	}
    }
    
    java.util.Collections.sort(a); // sorting the arraylist with the odd numbers in it
		/* Or just BubbleSort
		
		*/
    
    for(int i=0; i<index.size(); i++){
      	a.add(index.get(i), evenNum.get(i)); // adding the even numbers at their correct position (at their correct index like from the input array)
    }
   	 
 		for(int i=0; i<a.size(); i++){
     		arr[i]=a.get(i); // setting values from the arraylist to the returning array
    }
    
   		return arr; // returning the array
  }

/************************** Easy way ***********************
 * public static int[] SortingEasy(int a[]){							 *
 *	for(int i=0; i<a.length; i++){												 *
 *		for(int j=1; j<a.length; j++){											 *
 *			if(a[j-1]>a[j] && a[j-1]%2==1 && a[j]%2==1){			 *
 *				int s=a[j-1];																		 *
 *				a[j-1]=a[j];																		 *
 *				a[j]=s;																					 *
 *			}																									 *
 *		}																										 *
 *	}																											 *
 *	return a;																							 *
 *}																												 *
 ************************************************************/
	
  public static void main(String[] args){
		int a[]={9, 7, 8, 5, 3, 11, 14, 15, 20, 13, 16, 19};
		for(int i=0; i<Sorting(a).length; i++)
			a[i]=Sorting(a)[i];
		for(int i : a)
			System.out.print(i+" ");
		
	 /****************************************************************
		* Other quick and easy way to make it - using SortEasy method  *
		*	for(int i=0; i<SortingEasy(a).length; i++) 									 *
		*		a[i]=SortingEasy(a)[i];                   								 *
		*	for(int i : a)                              					 			 *
		*		System.out.print(i+" ");                  	 							 *
		****************************************************************/
		
  }
}
