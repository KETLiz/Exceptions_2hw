package task2;

public class Solve {
    
    public void foo() {
        try {
            int[] intArray = new int[9];
            int d = 0;
            double catchRes1 = intArray[8]/d;
            System.out.println("catchRes1 = " + catchRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception " + e);
        } 
    }
}
