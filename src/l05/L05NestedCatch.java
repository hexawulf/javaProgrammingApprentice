package l05;

public class L05NestedCatch {

    public static void main(String[] args) {
        int A[] = {30, 20, 10, 40, 0};
        try {
            int c = A[0] / A[1];
            System.out.println("c = " + c);
            try {
                System.out.println(A[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out Of Bounds Exception: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } finally {
            System.out.println("This is the finally block, it always executes.");
        }
        System.out.println("Bye!");
    }
}
