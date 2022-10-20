
public class ReturnValues {
 
    public static void main(String[] args) {
        double measure1 = area(24.5,14.2, "area");
        double measure2 =  area(3.2,4.1, "perimeter");

        System.out.println(measure1);
    }
    public static double area(double width, double height, String option) {
        switch (option){
            case "area":
                return width * height;
            case "perimeter":
                return 2 * (height + width);
            default: return 404;
        }
        }
    public static void stringPointer(double length, double width, double area, String option) {
        System.out.println("The area of the rectangle with length " + length + "and width " + width + " is equal to" + area);
    }
}
