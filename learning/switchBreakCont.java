package learning;

import java.util.Scanner;

public class switchBreakCont {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


       //1st Method
        /*System.out.println("Enter the number :");
        int n=scan.nextInt();
        switch(n){
            case 1 : System.out.println("01");
            break;
            case 2 : System.out.println("02");
            break;
            case 3 : System.out.println("03");
            break;
            case 4 : System.out.println("04");
            break;
            default: System.out.println("not");

        }*/

        //2nd Method
        System.out.println("Enter the Days");
        int day= scan.nextInt();
        switch (day){
            case 1-> System.out.println("monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");

        }
    }
}
