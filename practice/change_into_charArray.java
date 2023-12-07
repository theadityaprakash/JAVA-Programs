package practice;

public class change_into_charArray {
    public static void main(String[] args) {
        String s="Aditya";

        //Change String into Character array
        /*char[] a=s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/

        //Change String into String Array and print First character of that Array
        String str="hii i m aditya";
        String[] sa=str.split(" ");

        for (int i = 0; i < sa.length; i++) {
            char ch=sa[i].charAt(0);
            System.out.println(ch);
        }

        //Change String into String Array and print it
        String s1="how are you";
        String [] sa1=s1.split(" ");
        for (int i = 0; i < sa1.length; i++) {
            char ch =sa1[i].charAt(0);
        }

        //Change characters into String
        char ch1='a';
        char ch2='b';
        char ch3='c';
        char ch4='d';

        char[] chr={ch1, ch2, ch3, ch4};
        String str1=new String(chr);

        System.out.println(str1);


    }
}
