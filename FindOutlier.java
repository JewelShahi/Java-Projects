//sum of numbers from 1 to n
import java.util.Scanner;
public class FindOutlier{
  static int find(int[] integers){
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
}}
