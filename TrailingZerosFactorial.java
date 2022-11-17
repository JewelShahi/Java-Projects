/*
Write a program that will calculate the number of trailing zeros in a factorial of a given number.
N! = 1 * 2 * 3 *  ... * N
1000! has 2568 digits
*/
import java.util.Scanner;
class TrailingZerosFactorial{
	public static int Zeros(int n){
    		int result = 0;
    		while(n!=0)
        		result += n/=5;
		return result;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input;
		do{
			input=scan.nextInt();
		}while(input<=0);
      	System.out.println(Zeros(input));
	}
}
