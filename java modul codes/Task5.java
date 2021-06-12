import java.util.Scanner;

public class Task5 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String abc = scanner.nextLine();
    String abs = scanner.nextLine();
    System.out.print(res1(abc,abs));
}
   public static String res1(String a, String b){
    String name;
    String name1;
    if(a.length()>=1 || b.length()>=1){
        name = a.substring(1);
        name1 = b.substring(1);
    }else{
        name = a;
        name1 = b;
    }
    return name+name1;
   }



}
