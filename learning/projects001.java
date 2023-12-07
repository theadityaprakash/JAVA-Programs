package learning;

import java.util.Scanner;

public class projects001 {
    public static void main(String[] args){

        /*System.out.println("Enter your Subject number :");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int[] array =new int[x];

        double sum=0;

        for(int i=0;i<array.length;i++)
        {
            System.out.println("Enter the marks of your subject "+(i+1) +":");
            array[i]=scan.nextInt();
        }

        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }

        double avarage=sum/ array.length;
        System.out.println("Avarage :"+avarage);

        if(avarage>90){
            System.out.println("Your Grade is A");
        }
        else if (avarage>75){
            System.out.println("Your grade is B");
        }
        else if (avarage>50){
            System.out.println("your grade is c");
        }
        else if(avarage>30){
            System.out.println("Sorry you are fail");
        }*/

        Scanner scan=new Scanner(System.in);
        System.out.println("ENter your number of Subject :");
        int x= scan.nextInt();

        double[] array= new double[x];
        double sum=0;

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the number of subject"+(i|+1)+":");
            array[i]=scan.nextDouble();
        }
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        double avarage=sum/ array.length;
        System.out.println("Avarage :"+avarage);

        if(avarage>90){
            System.out.println("Your Grade is A");
        }
        else if (avarage>75){
            System.out.println("Your grade is B");
        }
        else if (avarage>50){
            System.out.println("your grade is c");
        }
        else if(avarage>30) {
            System.out.println("Sorry you are fail");
        }
    }
}
