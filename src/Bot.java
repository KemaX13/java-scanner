import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, ¿Cómo te llamas?");
        String name = scanner.nextLine();

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("Hola " + name + "! Soy un Bot. ¿De qué ciudad eres?");
        String city = scanner.nextLine();

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("He escuchado que " + city + " es un encanto. Yo nací en Oracle city.");
        System.out.println("\n¿Cuántos años tienes?");
        int age = Integer.parseInt(scanner.nextLine());

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("Entonces me dices que tienes " + age + " años. Yo tengo 400 años.");
        System.out.println("Eso quiere decir que soy " + (400 / (double)age) + " veces más vieja que tu.");
        System.out.println("Basta de hablar de mi misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");
        String language = scanner.nextLine();

        //Recoge el dato
        //Añade una nueva línea.
        System.out.println(language + ", ¡Eso es excelente! Mucho gusto haber hablado contigo " + name + ", ¡Hablamos luego!");

        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner
        scanner.close();
    }
}
