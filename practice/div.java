package practice;

/*public class div {
    public static void main(String[] args) {
        int n=283;
        int num=n;
        int count=0;
        while(num>0){
            num=num/10;
            count=count+1;
           // System.out.println(count);
        }
        num=n;
        int digit;
        int pow=1;
        int sum=0;
        while(num>0){
            digit=num%10;
           // System.out.println(digit);
            for (int i = 0; i < count; i++) {
                pow=digit*count;
                //System.out.println(pow);
            }
            sum=sum+pow;
            System.out.println(sum);
            num=num/10;
            System.out.println(num);
        }
    }
}*/
public class div {

    static int cal(int a) {
        int n = a;
        int count = 0;
        int temp = a;

        // Calculate the number of digits in 'a'
        while (temp > 0) {
            temp = temp / 10;
            count = count + 1;
        }

        int sum = 0;

        // Calculate the sum of digits raised to the power of the number of digits
        temp = a;
        while (temp > 0) {
            int digit = temp % 10;
            int digitPower = 1;

            // Calculate digit raised to the power of count
            for (int i = 0; i < count; i++) {
                digitPower *= digit;
            }

            sum += digitPower;
            temp = temp / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 153;
        int result = cal(num);

        if (result == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}

