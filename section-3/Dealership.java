import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println(".   Select option 'a' to buy a car .");
        System.out.println(".   Select option 'b' to sell a car .");

        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your budget?");
                int budget = scan.nextInt();

                if(budget >= 10_000){
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a drivers license? Write 'yes' or 'no'");
                    String driversLicense = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if(insurance.equals("yes") && driversLicense.equals("yes") && creditScore >= 660){
                        System.out.println("Sold! PLeasure doing business with you");
                    }else{
                        System.out.println("Sorry, you are not eligible");
                    }
                } else{
                    System.out.println("We dont sell cars under $10,000");
                }
                break;
            case "b":
                System.out.println("What is your car valued at");
                int value = scan.nextInt();
                System.out.println("What is your selling value?");
                int price  = scan.nextInt();
                if(value > price && price < 30_000 ){
                    System.out.println("We will buy your car");
                } else{
                    System.out.println("Sorry we are not interested");
                }
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        scan.close();
    }
}
