package GFG.String;

import java.util.Scanner;

public class substringRange {

    static String range(String str, int num1, int num2) {
        String emp = "";
        for (int i = num1; i <= num2; i++) {
            emp = emp + str.charAt(i);
        }
        return emp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        String str = s.next();

        String result = range(str, num1, num2);
        System.out.println(result);
    }

}


    /*public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int FirstIndex=s.nextInt();
        int LastIndex=s.nextInt();
        String input=s.next();

        String str="";
        for (int i = FirstIndex; i <= LastIndex; i++) {
             str= str + input.charAt(i);
        }
        System.out.println(str);
    }
}*/
