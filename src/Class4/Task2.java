package Class4;

public class Task2 {
    public static void main(String[] args) {

        double mortgageRate = 4.2;
        double mortgagePrice = 60000;

        if (mortgageRate > 4.5) {
            System.out.println("User will not buy a house");
        } else {
            System.out.println("User will consider buying");

            if (mortgagePrice > 50000) {
                System.out.println("User will take a loan");
            } else {
                System.out.println("User can buy it for cash");
            }
        }
    }
}