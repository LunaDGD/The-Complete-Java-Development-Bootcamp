

public class Scope {
    //cannot access a variable beyond the scope of its existence
    // every variable & method and the class level needs to be static

    static int dog = 2;
    public static void main(String[] args) {
        someFunction();
        System.out.println(apples);   // does not print bc apples if a var defined in a function
        System.out.println(dog);
    }
    public static void someFunction(){
        int apples = 5;
        System.out.println(dog);
     }
}
