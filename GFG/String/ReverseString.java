package GFG.String;

public class ReverseString {
    public static void main(String[] args) {
        String s= "hello";
        String revStr="";

        // 1st method
        for (int i = s.length()-1; i >=0; i--) {
           revStr=revStr + s.charAt(i);
        }
        System.out.println(revStr);


        //2nd method
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }

        System.out.println();

        //3rd method
        char[] ca=s.toCharArray();
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(ca[i]);
        }


        System.out.println();
        //4th method
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());

        //5th method
        StringBuilder sbu= new StringBuilder(s);
        System.out.println(sbu.reverse());
    }
}
