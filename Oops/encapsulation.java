package Oops;
class employ{
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        employ obj=new employ();
        obj.setNum(12);
        System.out.println(obj.getNum());
    }
}
