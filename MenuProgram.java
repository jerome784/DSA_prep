// 30. Write a Java program to display a menu using switch case and perform basic operations.
import java.util.Scanner;
public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Square");
        System.out.println("2. Cube");
        System.out.println("3. Exit");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int n = sc.nextInt();
                System.out.println(n * n);
                break;

            case 2:
                n = sc.nextInt();
                System.out.println(n * n * n);
                break;

            case 3:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}