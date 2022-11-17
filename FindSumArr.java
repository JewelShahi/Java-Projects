/*
Find the entered  number in a vector where the sum of the valus in the number is the entered number
*/

class FindSumArr{
	public static int[] Add(int n[], int tar){
		int saverArr[] = new int[2];// making an array to save the indexes

		// finding from the vector numbers that are equal to entered number from the user
		for(int i=0; i<n.length; i++){
      		for(int j=0; j<n.length; j++){
      			if(n[i]+n[j]==tar&&i!=j){// the number musn't be it self
            			saverArr[0]=i;
            			saverArr[1]=j;
            			break;
          			}
        		}
      		}
		return saverArr;
	}

	public static void main(String[] args){
    		int a[]={4, 5, 1, 8, 2, 7};
      		System.out.println(Add(a, 5)[0]+" "+Add(a, 5)[1]);
	}
}
