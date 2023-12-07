package learning;

public class stingBuffer {
    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("hello");
        System.out.println(sb.capacity());

        sb.append("Aditya javaa");
        System.out.println(sb.capacity());  //[(old capacity*2)+2  or (old capacity+1)*2]

    }
}
