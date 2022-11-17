import java.util.Scanner;
class DecToHex {
  public static String toHexVal(int r) {
    switch(r){
      case 10:
        return "A";
      case 11:
        return "B";
      case 12:
        return "C";
      case 13:
        return "D";
      case 14:
        return "E";
      case 15:
        return "F";
    }
    return Integer.toString(r);
  }

  public static String backWords(String s) {
    String saver="";
    for (int i=s.length()-1; i>=0; i--) {
      saver+=s.charAt(i);
    }
    return saver;
  }

  public static String Hexadecimal(int n) {
    String str="";
    int d=0, r=0;
    do{
      if (n>=16) {
        d=n/16;
        r=n-d*16;
        n=d;
        str+=toHexVal(r);
      }else if(n<16){
        if(n!=0){
          r=n;
          n=0;
          str+=toHexVal(r);
        }else{
          str+="0";
        }
      }
    }while(n!=0);
    str=backWords(str);
    return str;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = scan.nextInt();
    System.out.println("\nResult:\n"+Hexadecimal(n));
    scan.close();
  }
}
