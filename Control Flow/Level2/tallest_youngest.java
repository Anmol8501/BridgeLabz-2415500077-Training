import java.util.*;
public class tallest_youngest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age of Aman: ");
        int a=scanner.nextInt();
        System.out.print("Enter age of Akbar: ");
        int b=scanner.nextInt();
        System.out.print("Enter age of Anthony: ");   
        int c=scanner.nextInt();
        if (a<b && a<c){
            System.out.println("Aman is the youngest");
        }
        else if (b<a && b<c){
            System.out.println("Akbar is the youngest");
        }
        else{
            System.out.println("Anthony is the youngest");
        }
        System.out.print("Enter height of Aman: ");
        int h1=scanner.nextInt();
        System.out.print("Enter height of Akbar: ");
        int h2=scanner.nextInt();
        System.out.print("Enter height of Anthony: ");   
        int h3=scanner.nextInt();
        if (h1>h2 && h1>h3){
            System.out.println("Aman is the tallest");
        }
        else if (h2>h1 && h2>h3){
            System.out.println("Akbar is the tallest");
        }
        else{
            System.out.println("Anthony is the tallest");
        }   
    }
}
