public class TypeConversion {
    public static void main(String[] args) {
        //casting double to int
        double decimal = 4.3;
        // int integer = (the type your casting to)<the original value>
        int  integer = (int) decimal;

        double salary = 5833.333333;
        int roundedSalary = (int) salary;
        System.out.println("Percy salary is $" + roundedSalary);


    }
}
