import java.util.Scanner;
public class ScannerSurvey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// instantiate Scanner
        // <the type> <variable name> = A new Scanneer value

        System.out.println("Welcome. Thank you for taking the survey");

        int counter = 0;

        System.out.println("what is your name?");
        String name = scan.nextLine(); // waits for users input. nextLine() for string
        counter++;

        System.out.println("\nhow much money do you spend on coffe?");
        double coffeePrice = scan.nextDouble(); // nextDouble() for double
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name + " for answering all " + counter + " questions.");
        System.out.println("Your fast food expenses are " + (foodPrice/coffeePrice) + " times more than your coffee amount");
        System.out.println("Weekly, you spend " + (coffeeAmount*coffeePrice) + " on coffe");
        System.out.println("Weekly, you spend " + (foodAmount*foodPrice) + " on fast food");

        scan.close();// close the scanner to prevent memory leak

    }
}
