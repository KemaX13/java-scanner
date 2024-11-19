import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String name = scanner.nextLine();

        System.out.println("Hola " + name + ", bienvenida al scanner de Java");

        scanner.close();
    }
}
