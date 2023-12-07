package array02;

/*public class BubbleSort {
    public static void main(String[] args) {
        int[] a={30,10,50,80,5};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j< a.length-1;j++){

                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}*/


//for large number of Data

/*public class BubbleSort{
    public static void main(String[] args) {
        int[] a={20,3,23,53,343,5,34,6,5,55,45,5,756,9,6,1,64,4,87,45,23,90,0,10};

        int temp;
        for (int i = 0; i < a.length; i++) {
            int flag=0;
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }
    }
}*/


//String shorting using BubbleSort
public class BubbleSort{
    public static void main(String[] args) {
        String[] a={"Aditya","Sumedha","Rajeev","Shakti","Swati","Khushboo","Ashwani","Suman"};
        String temp;

        for (int i=0;i<a.length;i++){
            int flag=0;
            for (int j = 0; j < a.length-1-i; j++) {

                if(a[i].compareTo(a[i+1])>0){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }

            }
            if (flag==0){
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }
    }
}



