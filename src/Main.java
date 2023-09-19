import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("number 1:");
        int a=scanner.nextInt();
        System.out.println("number 2:");
        int b=scanner.nextInt();

        if (b<=a){
            System.out.println("The second number should be bigger");
        }
        else {
            for (int i = a; i < b; i++) {
                System.out.println(i);
            }
        }
    }
}