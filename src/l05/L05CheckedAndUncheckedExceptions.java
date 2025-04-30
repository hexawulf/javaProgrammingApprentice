 package l05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L05CheckedAndUncheckedExceptions {

    public static void main(String[] args) {
        fun1(); // Unchecked exception demonstration
        fun2(); // Checked exception demonstration
    }

    static void fun1() {
        try {
            System.out.println(10 / 0); // ArithmeticException (unchecked)
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void fun2() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt")); // IOException (checked)
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

