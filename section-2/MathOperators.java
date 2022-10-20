public class MathOperators {

    /*
     * Operation betwen whole numbers will always return whole numbers
     * operations betwen decimals will always return decimals
     */
    public static void main(String[] args) {
        int bagOfSweets = 5;
        int bagOfSweets2 = 10;
        long starsInMilkyway= 2500000000L;
        long starsInAndromeda = 1000000000000L;
        double testScores = 6.7;
        double bonusMarks = 2.5;
        System.out.println(bagOfSweets + bagOfSweets2);
        System.out.println(starsInMilkyway + starsInAndromeda);
        System.out.println(testScores + bonusMarks);
        System.out.println(" 10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2)); // returns 0
        System.out.println("  5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2));   // returns 1
    }
}

