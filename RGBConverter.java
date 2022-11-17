import java.util.Scanner;
class RGBConverter {

  // rgb converter in hex
  public static String rgb(int r, int g, int b) {
    String saver="";

    // if the values are negative
    r=r<0?0:r;
    g=g<0?0:g;
    b=b<0?0:b;

    // if the values are bigger than 255
    r=r<=255?r:255;
    g=g<=255?g:255;
    b=b<=255?b:255;

    // concating the values
    saver+=Hexadecimal(r);
    saver+=Hexadecimal(g);
    saver+=Hexadecimal(b);

    // returning the exct for of hex value in programming language
    return "0x"+saver;
  }

  // remainder converter
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

  // reversing the string
  public static String backWords(String s) {
    String saver="";
    for (int i=s.length()-1; i>=0; i--) {
      saver+=s.charAt(i);
    }
    return saver;
  }

  // hex converter
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
    if(str.length()<2){
      str="0"+str;
    }
    return str;
  }

  // main method
  public static void main(String[] args) {
    System.out.println(rgb(56, 0, 8));
    System.out.println(rgb(98, -050, 8));
    System.out.println(rgb(457, 135, 255));
  }
}