package Oops;

public class fraction {

    private int numerator;
    private int denominator;

    public fraction(int numerator,int denominator){
        if(denominator==0){
            denominator=1;
        }
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }

    private void simplify(){
        int gcd=1;
        int smaller=Math.min(numerator,denominator);
        for(int i=2; i<=smaller;i++){
            if (numerator % i==0 && denominator % i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);

    }
    public void add(fraction f2){

       this.numerator=this.numerator*f2.denominator+this.denominator* f2.numerator;
       this.denominator=this.denominator* f2.denominator;
       simplify();
    }

    public static fraction add(fraction f1,fraction f2){
        int newNum=f1.numerator* f2.denominator+ f1.denominator* f2.denominator;
        int newDeno=f1.denominator* f2.denominator;
        fraction f3=new fraction(newNum,newDeno);
        return f3;
    }
    public void increment(){

        numerator=numerator+denominator;
        simplify();
    }
    public void setnumerator(int num){
        this.numerator=num;
        simplify();

    }
    public int getnumerator(){
        return numerator;
    }

    public void setdenominator(int num){
        if(num==0){
            return;
        }
        this.denominator=num;
        simplify();
    }
    public int getdenominator(){
        return denominator;
    }


    public static void main(String[] args) {
        fraction f1= new fraction(4,6);
        f1.print();
        // f1.increment();
        // f1.setnumerator(4);
       // f1.setdenominator(8);
        //System.out.print(f1.getnumerator()+"\n"+ f1.getdenominator());
        f1.print();

        fraction f2= new fraction(4,8);
        f1.add(f2);
        f1.print();

        fraction f3=fraction.add(f1,f2);
        f3.print();
    }
}
