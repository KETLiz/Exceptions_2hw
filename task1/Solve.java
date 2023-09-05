package task1;
import java.util.Scanner;

public class Solve {
    Scanner in;
    boolean work;

    public Solve() {
        in = new Scanner(System.in);
        work = true;
    }

    public void inputNumber() {
        while(work) {
            System.out.print("Введите дробное число: ");
            try {
                String num = in.nextLine();
                float res = Float.parseFloat(num);
                System.out.printf("Вы ввели число %f", res);
                work = false;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели невалидное значение. Попробуйте ещё раз");
            }
        }
    }

}
