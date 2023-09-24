import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the currency rate");
            double currency = scanner.nextDouble();
            System.out.println("Enter amount of money");
            int hryvna = scanner.nextInt();
            double amount = ((int)(hryvna/currency));
            double change = hryvna - amount * currency;
            System.out.println("You can buy" + amount);
        if (change !=0) {         
            System.out.printf("Your rest of money is %.2f ", change);
        } else {
            System.out.println("Change is free");
        }  
    }     

    }

