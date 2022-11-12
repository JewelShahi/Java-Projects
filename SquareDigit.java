//sum of numbers from 1 to n
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
}
