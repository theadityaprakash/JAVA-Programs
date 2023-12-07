package prepInsta;

import java.util.Scanner;

public class reverseNumb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();

        //1st method using while loop
        /*int res,temp=0;
        while(num!=0){
            res=num%10;
            temp=temp*10+res;
            num=num/10;
        }
        System.out.println(temp);*/

        //2nd method using for loop
        int res,temp=0;
        for(;num!=0;num=num/10){
            res=num%10;
            temp=temp*10+res;

        }
        System.out.println(temp);

    }
}
