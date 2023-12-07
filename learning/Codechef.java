package learning;

import java.util.Scanner;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            int x = read.nextInt();
            int y = read.nextInt();
            // Update the code below this line to solve the problem
            if(x*3<y*2){
                System.out.println(x*3);
            }
            else{
                System.out.println(y*2);
            }
        }
    }
}