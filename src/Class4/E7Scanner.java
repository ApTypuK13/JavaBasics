package Class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Full name");
        String name = scanner.nextLine();// if you need space
        System.out.println("Your Full name is "+name);
    }
}
