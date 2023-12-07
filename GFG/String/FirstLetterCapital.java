package GFG.String;

public class FirstLetterCapital {
    public static void main(String[] args) {
        String s="hii i m aditya";
        String emp="";

        String[] sa=s.split(" ");
        for (int i = 0; i < sa.length; i++) {
            char c=sa[i].charAt(0);
            String s1= String.valueOf(c).toUpperCase();
            String sub=sa[i].substring(1);
            emp=emp+s1+sub+" ";
        }
        System.out.println(emp.trim());

        //to understand this above code check String package


        //using StringBuilder (better time complexity)
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '&& i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());

    }
}
