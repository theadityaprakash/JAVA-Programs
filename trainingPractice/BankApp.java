package trainingPractice;

public class BankApp {

    String name,ac_no;
    int amount;


    public void createAc(String name,String ac_no){

        this.name=name;
        this.ac_no=ac_no;
        System.out.println("hii" +this.name);
        System.out.println("account number" +this.ac_no);
        System.out.println("......");
    }

    public void withdrawlAmount(int withdrawl){
        System.out.println("........Withdraw section........");
        System.out.println(this.name +"name"+ amount +"deposited");
        amount=amount+withdrawl;
        System.out.println("your balance"+withdrawl);
    }

    public void depositAmount(int deposit){
        System.out.println(".........Deposit section.........");
        System.out.println(this.name +"name"+ amount +"deposited");
        amount=amount+deposit;
        System.out.println("your balance"+deposit);
    }
}
