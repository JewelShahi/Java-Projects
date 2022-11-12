//sum of numbers from 1 to n
import java.util.Scanner;
public class GrassHopper {

    public static int Summation(int n) {
        int sum=0;
        for(int i=n; i>=1; i--)
          sum+=i;
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInteger();
        n=Math.abs(n);
        System.out.printf("The sum of numbers from 1 to %d is: %d", n, Summation(n));
    }

}
