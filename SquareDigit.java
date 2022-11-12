/*
For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
*/
import java.util.Scanner;
public class SquareDigit {
  public int squareDigits(int n) {
    String result = "", number = Integer.toString(n);
    int power=0;
    for(int i=0; i<number.length(); i++){
      power = Character.getNumericValue(number.charAt(i))*Character.getNumericValue(number.charAt(i));
      result += Integer.toString(power);
    }
    return Integer.parseInt(result);
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = scan.nextInt();
    System.out.printf("The square of digits in number %d is %s.\n", n, squareDigits(n));
  }
}
