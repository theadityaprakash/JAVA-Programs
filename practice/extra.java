package practice;


public class extra {
    public final int MAX_VALUE = 100;
    private final String name;
    public final void displayMessage() {
        System.out.println("This is a final method.");
    }
    final class FinalClass {
    }
    public extra(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        extra example = new extra("John");
        example.printName();
        example.displayMessage();
    }
}



