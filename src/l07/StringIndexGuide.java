package l07;

public class StringIndexGuide {
    // The main method is optional here, you can keep or remove it
    public static void main(String[] args) {
        String str = "JavaProgramming";
        printIndexGuide(str);
    }
    
    // Make this method public and static so it can be called from other classes
    public static void printIndexGuide(String input) {
        // Print character line
        System.out.print("Char:  ");
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            // Add appropriate spacing based on the character width
            if (i < input.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        // Print index line
        System.out.print("Index: ");
        for (int i = 0; i < input.length(); i++) {
            // For single-digit numbers, add a space after
            if (i < 10) {
                System.out.print(i);
                // Add a space if it's not the last character
                if (i < input.length() - 1) {
                    System.out.print(" ");
                }
            } else {
                // For double-digit numbers, no extra space needed
                System.out.print(i);
                // Only add a space if not the last character
                if (i < input.length() - 1) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    
    }
}