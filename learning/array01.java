package learning;

//import sun.security.util.Length;

import java.util.Scanner;
public class array01 {

        /* public static void main(String[] args) {

        int[] arr = new int[10];
        char[] car = new char[11];
        double[] dou = new double[8];
        float[] flo=new float[10];
        String[] stg = new String[9];
        arr[3]=12;
        arr[7]=2;
        car[10]='A';
        car[9]='S';
        dou[5]=41.9;
        flo[3]=2;
        stg[6]="adi";
        stg[7]="shu";

        System.out.println(arr[3]+"\n"+car[10]+" "+car[9]+"\n"+stg[6]+" "+stg[7]);
        System.out.println(dou[5]+"\n"+flo[3]);


    }*/

        /*System.out.println("Enter the size of array");
        int size=scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the array");
            array[i]=scan.nextInt();
        }
        System.out.println("array are:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }*/

        /*public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int[] a=new int[n];

            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        }*/

    //Array using Function
        /*public static void out(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static int[] in(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a=in();
        out(a);
    }*/


        /*txt[0]=0;
        txt[1]=7;
        txt[2]=3.8888;
        txt[3]=777.98;

        double A =txt[2]+txt[1]+txt[0]-txt[3]*txt[0];

        System.out.println(A);*/

        /* int[] numb=new int[3];

        numb[0]=1;
        numb[1]=2;
        numb[2]=3;

        System.out.println(numb[0]);
        System.out.println(numb[1]);
        System.out.println(numb[2]);*/

        /* int[] numb=new int[3];

        numb[0]=1;
        numb[1]=2;
        numb[2]=3;

        for(int i=0;i<3;i++){
            System.out.println(numb[i]);
        }*/

        /*int size=scan.nextInt();
        int[] numb=new int[size];

        for(int i=0;i<size;i++){
            System.out.println(numb[i]);
        }*/

        /*System.out.println("Enter the size of array");
        int size= scan.nextInt();
        int[] num=new int[size];

        System.out.println("Enter the array");
        for(int i=0;i<size;i++){
            num[i]=scan.nextInt();
        }

        System.out.println("Output : ");
        for(int i=0;i<size;i++){
            System.out.println(num[i]);
        }*/

        /* System.out.println("Enter the size of Array : ");
        int size= scan.nextInt();
        int []abc=new int[size];

        for (int i=0;i<size;i++){
            abc[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(abc[i]);
        }*/

        /*System.out.println("Enter the Size of Number : ");
        int abc= scan.nextInt();
        int[] num=new int[abc];

        for (int i = 0; i <abc ; i++) {
            num[i]=scan.nextInt();
        }

        int x= scan.nextInt();

        for (int i = 0; i <abc; i++) {
            //for (int i = 0; i <num.length; i++) {             //this num.length (name.length) is use to know the size of array
            if(num[i]==x){
                System.out.println("Number n place "+i);
            }
        }*/

        //Question

    //Take an array of names as input from the user and print them on the screen.
        /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the no. of Element");
        int abc = scan.nextInt();
        int[] num = new int[abc];

        System.out.println("Enter the Element");
        for (int i = 0; i < abc; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println("Output :");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
    }*/

    // Find the maximum & max_minDifference number in an array of integers.
        /*public static void main(String[] args) {

        System.out.print("Enter the size of array : ");
        Scanner scan = new Scanner(System.in);
        int abc = scan.nextInt();
        int[] num = new int[abc];

        System.out.println("Enter the element of array:");
        for (int i = 0; i < abc; i++) {
            num[i] = scan.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("maximum no. : " + max);
        System.out.println("max_minDifference no. : " + min);
    }*/

    //find the max number in array
        /*public static void main(String[] args) {
        int[] a=new int[5];

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Element");
        for (int i = 0; i < 5; i++) {
            a[i] = s.nextInt();
        }

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max no.: "+max);
    }*/

    //find the min number
        /*public static void main(String[] args) {

        int[] a = {2, 4, 5, 6, 9};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }*/

    //find maximum number using function in Array
        /*public static int[] input(){
            Scanner s=new Scanner(System.in);
            System.out.print("Enter the size of Array: ");
            int n=s.nextInt();
            int[] arr=new int[n];

            System.out.println("Enter the Elements: ");
            for(int i=0;i<n;i++){
                arr[i]= s.nextInt();
            }
            return arr;
        }
        public static int large(int arr[]){
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>max) {
                    max=arr[i];
                }
            }
            return max;
        }
        public static void out(int []arr){
        int max=large(arr);
            System.out.println("Largest number:"+max);
        }

    public static void main(String[] args) {
        int[] arr=input();
        out(arr);
    }*/

    //find max_minDifference number using function in Array
        /*public static int[] arr(){
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();

            }
            return arr;
        }
        public static int small(int arr[]){
            int min= Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
        }
        public static void out(int[] arr){
            int min=small(arr);
            System.out.println("Smallest number: "+min);
        }

    public static void main(String[] args) {
        int[] arr=arr();
        out(arr);
    }*/

    //array using function
        /*public static void output(int[] abc){
        int n= abc.length;
        for (int i = 0; i < n; i++) {
            System.out.println(abc[i]);

        }
    }
    public static int[] takeinput(){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int abc[]=new int[n];

        for (int i = 0; i <n; i++) {
            abc[i]= scan.nextInt();
        }
        return abc;
    }
        public static void main(String[] args){
        int[] abc=takeinput();
        output(abc);*/

        /*public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int n= scan.nextInt();
            int[] arry=new int[n];

            for(int i=0;i<n;i++){
                arry[i]= scan.nextInt();

            }
            for(int i=0;i<n;i++){
                System.out.println(arry[i]);
            }
        }*/

        /*public static void out(int[] arry){
        System.out.println("Array is: ");
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
    }
       public static int[] inp(){
           System.out.println("Enter the size of array: ");
           Scanner s=new Scanner(System.in);
           int n=s.nextInt();
           int[]arry=new int[n];

           System.out.println("Enter the Array Elements");
           for (int i = 0; i <n; i++) {
               arry[i]= s.nextInt();
           }
           return arry;
       }

    public static void main(String[] args) {
        int[]arry= inp();
        out(arry);
    }*/

    //Increment function
        /*public static void main(String[] args) {
        int i=10;
        i++;
        System.out.println(i);
    }*/


        /*public static void increment(int i){
        i++;
    }
    public static void out(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
    public static void incrementArr(int[] arr){
        for(int i=0;i< arr.length;i++){
            arr[i]=arr[i]+1;
        }

    }
    public static void main(String[] args) {
        // int i=10;
        //increment(i);
        //System.out.println(i);
        int [] arr={1,2,3,4,5};
        incrementArr(arr);
        out(arr);

    }*/

    //print all pairs
        /*public static void printAllPair(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for (int j = i+1; j <n; j++) {
                System.out.println("("+arr[i]+","+arr[j]+")" );
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,5,3};
        printAllPair(arr);
    }*/

}
