/*

*/
import java.util.*;
public class FindOutlier{
  public static int findOdd(int[] integers){
    int odd=0, even=0, result = 0;
    for(int i=0; i<integers.length; i++){
      if(integers[i]%2==0) even++;
      else odd++;
    }
    if(even>odd){
      for(int i: integers){
        if(!(i%2==0)) result=i;
      }
    }else{
      for(int i: integers){
        if(i%2==0) result=i;
      }
    }
    return result;
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter how many numbers to add:");
    int n = scan.nextInt();
    int[] integers = new int[n];
    for(int i=0; i<n; i++){
      integers[i]=scan.nextInt();
    }
    String saver = "[";
    for(int i=0; i<integers.length; i++){
      if(!(i+1==integers.length-1))
        saver+=Integer.toString(i)+", ";
      else 
        saver+=Integer.toString(i)+"]";
    }
    System.out.println("The odd number from the array "+saver+" is "+findOdd(integers));
  }
}
