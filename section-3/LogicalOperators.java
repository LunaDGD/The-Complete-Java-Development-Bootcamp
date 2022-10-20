public class LogicalOperators{
 public static void main(String[] args) {
    int chemGrade = 78;
    int engGrade = 65;

    if(chemGrade > engGrade || engGrade > 75){
        System.out.println("you got the scholarship!");
    } else{
        System.out.println("you did not get the scholarship");
    }

    int credits = 56;
    double gpa = 3.2;

    if(credits >= 40 && gpa >= 2.0){
        System.out.println("you got the diploma!");
    } else {
        System.out.println("sorry you need at least 40 credits and min gpa of 2.0");
    }
 }
}