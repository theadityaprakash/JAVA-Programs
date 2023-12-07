package learning;

import java.util.Scanner;

public class string {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);


       /*
        Scanner scan = new Scanner(System.in);
        String txt= scan.next();

        System.out.println(txt);

        //below code for learning.practice

        Scanner adi = new Scanner(System.in);
        String pra= adi.next();
        System.out.println(pra);

        //boolean method to take input from the user
        Scanner scan =new Scanner(System.in);
        Boolean txt= scan.nextBoolean();
        System.out.println(txt);

        //Double method to take input from the user
        Scanner scan= new Scanner(System.in);
        double txt = scan.nextDouble();
        System.out.println(txt);*/

        //Find the length of the String
        /*String s= "aditya";
        System.out.println(s.length());*/

        //For find out particular Character
        /*String s="Sumedha";
        System.out.println("It starts from Zero indexing "+ s.charAt(2));*/

        //Empty String and string with Space
        /*String s1="";
        String s2=" ";
        System.out.println("Length of Empty String "+s1.length());
        System.out.println("Length of String with Space "+s2.length());*/


        //Substring
        //char arr[]={'c','o','d','i','n','g'};
        /*String str1="coding";
        String substr=str1.substring(6);
        System.out.println(substr.length());*/

        //Concatenation (adding of two string)
        /* String str1="coding";
        String str2=" is fun";
        //the way in which you can concate string
        System.out.println(str1+str2);   //1st method

        //str1=str1+str2;                  //2nd method
       // System.out.println(str1);

       // str1+=str2;                     //3rd method
       // System.out.println(str1);

        str1=str1.concat(str2);        //4th method
        System.out.println(str1);*/

        //comparison of two string
        /*String str1="coding";
        String str2=" is fun";
        String str3="coding";
        String str4="Goding";

        //this give true and false
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        //this give asky value which means it subtract one string to another one
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str4));*/

        //for checking the word or character in the string
        /*String str1="coding";
        String str2=" is fun";
        System.out.println(str1.contains("ing"));
        System.out.println(str1.contains("x"));*/

        //subString
        /*String str="coding";

        //it will give all character after index 3
        System.out.println(str.substring(3));

        //it will give all character between index 2 and 5
        System.out.println(str.substring(2,5));

        //it will give string length
        String substr=str.substring(2);
        System.out.println(substr.length());

        //it will give string length with word
        String substr1=str.substring(2);
        System.out.println(substr1);
        System.out.println(substr1.length());*/

        //taking input
        /*String str;
        str=s.next();    //next is use for printing only first word or token
        System.out.println(str+"\n"+"length of the String: "+str.length());

        String str1=s.nextLine();   //nextLine is use to write whole sentence
        System.out.println(str1);*/

        //print code all char in different line
        /*String str=s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }*/

        //byte array can be passed in string constructor
        byte[] b={101,103,102};
        String sb=new String(b);
        System.out.println(sb);






    }
}
