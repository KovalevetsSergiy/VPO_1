import java.util.Scanner;

public class Dialog {
    public static void main(String[] args) {
        
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello ");
        System.out.println("Як тебе звати");
        name = scanner.nextLine();
        System.out.println("Скільки тобі років?");
        age = scanner.nextInt();

        System.out.println("Дуже приємно, " + name);
        System.out.println("Я знаю, що тобі " + age);
    }
} 
