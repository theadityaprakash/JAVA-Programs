package Searching;

import java.util.Scanner;

public class linear {

    //linear search of index number
    /*public static void main(String[] args) {
        int[] arr = {20, 30, 23, 42, 233, 12, 65, 86, 45};
        int target = 42;

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                System.out.println(index);
                return;
            }
            else{
                System.out.println("nun");
            }

        }
    }*/

    //linear search of index number using function
    /*public static void main(String[] args) {
        int[] nums={23,45,2, 4,5,34,32,8,57,79};
        int target=57;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    //Search the array
    static int linearSearch(int[]arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is =target
            int element=arr[index];
            if(element==target){
                return index;
            }

        }
        //if nothing we get it return -1
        return -1;
    }*/

    //linear search of index number using function by taking input from user
    /*static  int[] input(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n= s.nextInt();
        int[] arr=new int[n];


        System.out.println("Enter the Element of Array");
        for (int i = 0; i < n; i++) {
            arr[i]= s.nextInt();

        }
       return arr;
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
     return -1;
    }

    public static void main(String[] args) {
         int[] arr=input();
        Scanner s=new Scanner(System.in);
        System.out.println("which number place you want to find ");
        int target=s.nextInt();
        int ans=linearSearch(arr,target);
        System.out.println("Element is at position : "+ans);
    }*/

    public static void main(String[] args) {
        int[] a={2,4,5,6};
         int traget=5;

        for(int index=0;index<=a.length;index++){

        }
    }

}
