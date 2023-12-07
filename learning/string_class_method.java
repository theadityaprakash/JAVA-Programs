package learning;

public class string_class_method {
    public static void main(String[] args) {
        String s1="Aditya";
        String s2="Sumedha";
        String s3="prakash";

        System.out.println(s1+s2);
        System.out.println(s1+10);
        System.out.println(s1+10+20);
        System.out.println(10+s1+20);
        System.out.println(10+10+s1+s2);
        System.out.println(s1+10+s2);
        System.out.println(s1+20/10);   //it will follow BODMAS rule
        // System.out.println(s1+10-2);   //it is not allowed

        //concat method
        System.out.println(s1.concat(s2));

        //join method
        System.out.println(String.join("/",s1));
        System.out.println(String.join(";",s1,s2,s3));
        System.out.println(String.join("/",s1,s2,s1));
        System.out.println(String.join(" abc",s1,s2,s3));

        //SubSequence method
        String s4="This is Demo";
        System.out.println(s4.subSequence(3,9));

        //substring method
        System.out.println(s4.substring(6));
        System.out.println(s4.substring(3,8));


        System.out.println("---------------------");

        //replace method
        System.out.println(s4.replace("is","was"));

        //replaceFirst method
        System.out.println(s4.replaceFirst("is","was"));

        //replaceAll method
        System.out.println(s4.replaceAll("is","was"));
        System.out.println(s4.replaceAll("is(.)","was"));
        System.out.println(s4.replaceAll("is(.*)","was"));

        System.out.println("---------------------");

        //indexOf method
        String s5="Deepak";
        System.out.println(s5.indexOf("e"));

        //lastIndexOf method
        System.out.println(s5.lastIndexOf("e"));

        //CharAt method
        System.out.println(s5.charAt(3));

        //contains method
        System.out.println(s5.contains("e"));

        //StartSWith method
        System.out.println(s5.startsWith("e"));

        //endsWith method
        System.out.println(s5.endsWith("e"));

        //toUpper case method
        System.out.println(s5.toUpperCase());

        //toLower case method
        System.out.println(s5.toLowerCase());


        //valueOf method
        int a1=30, b1=20;
        String s6=String.valueOf(a1);
        String s7=String.valueOf(b1);
        System.out.println(s6+s7);

        //toCharArray method
        char[] c=s1.toCharArray();
        System.out.println(c);


    }
}
