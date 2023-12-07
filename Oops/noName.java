package Oops;

    // Java Program to Illustrate Getter and Setter

// Importing input output classes
import java.io.*;

    // Class 1
// Helper class
    class noName {

        // Member variable of this class
        private String name;

        // Method 1 - Getter
        public String getName() {
            return name;
        }

        // Method 2 - Setter
        public void setName(String N)
        {

            // This keyword refers to current instance itself
            this.name = N;
        }
    }

    // Class 2
// Main class
    class GFG {

        // Main driver method
        public static void main(String[] args)
        {
            // Creating an object of class 1 in main() method
            noName obj = new noName();

            // Setting the name by calling setter method
            obj.setName("Geeks for Geeks");
            // Getting the name by calling getter method
            System.out.println(obj.getName());
        }
    }


