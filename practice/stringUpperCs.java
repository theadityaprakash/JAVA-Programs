package practice;

public class stringUpperCs {
    public static void main(String[] args) {

        //1st method
        /*String s="hii i m aditya";
        String st1=""+Character.toUpperCase(s.charAt(0));
        System.out.println(st1);

        String st=""+Character.toUpperCase(s.charAt(0));

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==(' '))
            {

                st=st+Character.toUpperCase(s.charAt(i));
            }
            else
            {
                st=st+s.charAt(i);
            }
        }
        System.out.println(st);*/

        //2nd method
        String s="i m aditya";
        String emp="";

        String[] sa=s.split(" ");  //here we splited sentence into word
        for (int i = 0; i < sa.length; i++) {
           char c=sa[i].charAt(0);  //we took 1st char to that splited word

           String ne=String.valueOf(c).toUpperCase();  //we converted that first char into String and then in upper case
           String sub=sa[i].substring(1);  //using sub Array we added rest value of that word with first character
           emp=emp+ne+sub+" ";  //added all words in single line
        }
        System.out.println(emp.trim());  //removed last space from sentence and print it
    }
}
