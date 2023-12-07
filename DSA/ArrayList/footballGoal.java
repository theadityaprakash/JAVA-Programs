package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class footballGoal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int goal = s.nextInt();
            al.add(goal);
        }
        int team1= al.get(0)+al.get(2)+al.get(4)+al.get(6)+al.get(8);
        int team2= al.get(1)+al.get(3)+al.get(5)+al.get(7)+al.get(9);

        if(team1>team2){
            System.out.println("team1");
        } else if (team2>team1) {
            System.out.println("team2");
        } else {
            System.out.println("Zero");
        }
    }
}
