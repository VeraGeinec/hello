import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        {
            System.out.println("Hello!");
            System.out.println("How old are you?");
            {
                Scanner scanner = new Scanner(System.in);

                int age = scanner.nextInt();


                if (age < 18) {
                    System.out.println("You cant drive car!");
                } else {
                    System.out.println("You can drive car.");
                }

                {
                    System.out.println("Good bye.");
                }
            }
        }
    }
}

