public class DocComments {
    public static void main(String[] args) {
        
    }
    /**
     * Function name: greet
     * 
     * Inside this function:
     *  1. prints 'hi'
     */
    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Function name: printText
     * @param name (String)
     * @param age (String)
     * 
     * Inside this function:
     *  1. prints the name and age as part of the text
     */
    public static void printText(String name, String age){
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old");
    }


    /**
     * Function name: calcArea
     * 
     * @param length (double)
     * @param width (double)
     * @return
     * 
     * Inside this function: 
     *  1. calculates the area and returns it
     */
    public static double calcArea(double length, double width){
        double area = length * width;
        return area;
    }
}
