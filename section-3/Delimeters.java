import java.util.Scanner;

public class Delimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers on the same line");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter two very integers on the same line");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();
        System.out.println("Enter two deciamls on the same line");
        double decimals1 = scan.nextDouble();
        double decimals2 = scan.nextDouble();
        System.out.println("Enter two text values on the same line");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();
    }
}
