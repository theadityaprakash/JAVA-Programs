package learning;

public class string_method {
    public static void main(String[] args) {


        //One of the use of methods are to login or registering into any website or app.

        String empty="";
        String no=null;
        String name="Aditya prakash";
        String email="   Aditya@gmail.com  ";
        String pass="     abcd123";
        String space="   aditya sumedha ";

        //length method
        //1st method
        System.out.println(name +": "+name.length());

        //2nd method
        int i=name.length();
        if(i==0){
            System.out.println("its empty");
        }
        else{
            System.out.println(name.length());
        }


        //empty method
        //1st method
        System.out.println(name.isEmpty());
        System.out.println(empty.isEmpty());

        //2nd method
        boolean b=empty.isEmpty();
        if(b){
            System.out.println("its empty");
        }
        else {
            System.out.println("its valid");
        }

        //trim method
        //1st method
        System.out.println(pass);
        System.out.println(pass.trim());
        System.out.println(email+": "+email.length());
        System.out.println(email.trim());
        System.out.println(name.trim().length());
        System.out.println(space);
        System.out.println(space.trim()); //it will not trim space in between string

        //2nd method
        if(pass.trim().isEmpty()){
            System.out.println("name is empty");
        }
        else{
            System.out.println("valid name");
        }


        //equals method
        String name1="Aditya prakash";
        String name2="Aditya prakash";
        String name3="aditya prakash";
        String name4="Sumedha pal";

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name1.equals(name4));
        System.out.println(name1.equals("")); //this check string is empty or not using equals method
        System.out.println(empty.equals(""));

        //equalIgnoreCase method
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1.equalsIgnoreCase(name3));
        System.out.println(name1.equalsIgnoreCase(name4));


        //compareTo method
        String s1="a";
        String s2="a";
        String s3="A";
        String s4="b";
        String s5="ab";
        String s6="Ac";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s5.compareTo(s6));

        //CompareToIgnoreCase method
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s1.compareToIgnoreCase(s4));


    }

}
