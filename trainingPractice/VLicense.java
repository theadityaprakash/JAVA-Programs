package trainingPractice;

class MedProcess extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Medical Check Successfully " + i);
                sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class TestDrive extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Test Drive check Successfully " + i);
                sleep(3000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class LicenseGen extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("you Lincese generate successfully generated....Thank You " + i);
                sleep(3000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class VLicense {

    public static void main(String[] args) {
        MedProcess med = new MedProcess();
        TestDrive td = new TestDrive();
        LicenseGen lc = new LicenseGen();
        try {
            med.start();
            med.join();
            td.start();
            td.join();
            lc.start();
            lc.join();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

