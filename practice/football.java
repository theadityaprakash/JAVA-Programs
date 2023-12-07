package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();

        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            int k=s.nextInt();
            al.add(k);
        }
        int l=0;
        int n= al.get(l);
        int team1=0;
        int team2=0;
        System.out.println("this is n: "+" "+n);

        while (l< al.size()){
            if(2*n+1==1){
                team1=team1+1;
            } else if (2*n==1) {
                team2=team2+1;
            }
            else{
                System.out.println("no");
            }
            l++;
        }
        System.out.println(team1+"  "+team2);
    }
}
