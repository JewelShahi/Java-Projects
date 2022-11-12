//sum of numbers from 1 to n
import java.util.Scanner;
public class GrassHopper {

    public static int summation(int n) {
        int sum=0;
        for(int i=n; i>=1; i--)
          sum+=i;
        return sum;
    }

}