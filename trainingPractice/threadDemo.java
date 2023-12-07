package trainingPractice;

class child extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("child Thread " + i);
                sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }

}

public class threadDemo extends Thread {

    public static void main(String[] args) {

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("main thread " + i);
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        threadDemo th = new threadDemo();
        child ch = new child();
        try {
            th.start();
            th.join();
            ch.start();
            ch.join();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
