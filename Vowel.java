import java.util.Scanner;
class Vowel{
  public static int getCount(String str) {
    int count=0;
    for(int i=0; i<str.length(); i++){
      switch(str.charAt(i)){
          case 'a': case 'A': case 'e': case 'E': case 'i': case 'I':  case 'o': case 'O': case 'u': case 'U':
            count++;
      }
    }
    return count;
  }
  public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	System.out.println("Vowels: "+getCount(str));
	scan.close();
  }
}