import java.util.Scanner;
public class Currencyconvertor {
    
    static final double USD_RATE = 83.25;
    static final double EUR_RATE = 90.10;
    static final double GBP_RATE = 105.75;
    
    public static double convertFromINR(double amount, double rate) {
        return amount / rate;
    }
    
    public static double convertToINR(double amount, double rate) {
        return amount * rate;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println("===== SMART CURRENCY CONVERTER =====");
        do {
            System.out.println("\n1. INR to USD");
            System.out.println("2. INR to EUR");
            System.out.println("3. INR to GBP");
            System.out.println("4. USD to INR");
            System.out.println("5. Exit");
            System.out.print("Select Option: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount in INR: ");
                    double inr1 = s.nextDouble();
                    System.out.printf("USD: %.2f\n", convertFromINR(inr1, USD_RATE));
                    break;
                case 2:
                    System.out.print("Enter amount in INR: ");
                    double inr2 = s.nextDouble();
                    System.out.printf("EUR: %.2f\n", convertFromINR(inr2, EUR_RATE));
                    break;
                case 3:
                    System.out.print("Enter amount in INR: ");
                    double inr3 = s.nextDouble();
                    System.out.printf("GBP: %.2f\n", convertFromINR(inr3, GBP_RATE));
                    break;
                case 4:
                    System.out.print("Enter amount in USD: ");
                    double usd = s.nextDouble();
                    System.out.printf("INR: %.2f\n", convertToINR(usd, USD_RATE));
                    break;
                case 5:
                    System.out.println("Thank you for using Smart Currency Converter!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 5);

        s.close();
    }
}


