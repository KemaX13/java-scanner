import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro

        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        String name = scanner.nextLine();

        System.out.println("Escriba su apellido: ");
        String lastname = scanner.nextLine();

        System.out.println("Escriba su nombre de usuario: ");
        String username = scanner.nextLine();

        System.out.println("Escriba su contraseña: ");
        String password = scanner.nextLine();

        System.out.println("Hola " + name + " " + lastname + ", tu nombre de usuario es " + username + " y tu contraseña es " + password + ", gracias por registrarte.");
    }
}