package Class4;

public class Task1 {
    public static void main(String[] args) {

        double gpa = 3.0;
        boolean degree = false;

        if (degree == true) {
            System.out.println("Congratulations");

            if (gpa > 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have studier harder");
            }
        } else {
            System.out.println("You should get a degree");
        }
    }
}