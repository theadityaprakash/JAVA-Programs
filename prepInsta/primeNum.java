package prepInsta;

import java.util.Scanner;

//1st method
/*public class primeNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=s.nextInt();

        int temp=0;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                temp=temp+1;
            }
        }
        if(temp>0){
            System.out.println("not prime");
        }
        else {
            System.out.println("prime");
        }
    }
}
 */


//2nd method
/*public class primeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = s.nextInt();

        int temp=0;
        for(int i=1;i<=num;i++){

            if(num%i==0){
                temp=temp+1;
            }
        }
        if(temp==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}*/

//range in between prime or not

/*public class primeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int num1 = s.nextInt();
        System.out.print("Enter the 2nd number : ");
        int num2 = s.nextInt();

        int temp=0;
        for (int i = num1; i <= num2; i++) {
            for(int j=2;j<i;j++){
                if(i%j==0){
                    temp=1;
                    break;
                }
            }
            if(temp==0){
                System.out.println(i);
            }
            temp=0;
        }

    }
}*/


public class primeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int num1 = s.nextInt();
        System.out.print("Enter the 2nd number : ");
        int num2 = s.nextInt();


        for(int i=num1;i<=num2;i++){

           int temp=0;
            for (int j = 2; j <= i-1; j++) {
                if(i%j==0){
                    temp=temp+1;
                }

            }
            if(temp==0){
                System.out.println(i);
            }

        }

    }
}