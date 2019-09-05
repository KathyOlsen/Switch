import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month;
        String monthGroup28 = "February, except in leap year";
        String monthGroup29 = "February, but only in leap year";
        String monthGroup30 = "September April June November";
        String monthGroup31 = "January March May July August October December";
        String monthGroup = "";

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the number of days in a month from 28 to 31: ");
        month = key.nextInt();

        switch(month){
            case 28: monthGroup = monthGroup28;
                break;
            case 29: monthGroup = monthGroup29;
                break;
            case 30: monthGroup = monthGroup30;
                break;
            case 31: monthGroup = monthGroup31;
                break;
            default: monthGroup = "No such month";
                break;
        }
        System.out.println();
        System.out.println(monthGroup);
    }
}
