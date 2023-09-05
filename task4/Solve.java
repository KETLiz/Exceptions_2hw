package task4;

import java.util.Scanner;

public class Solve {
    Scanner in;

    public Solve() {
        in = new Scanner(System.in);
    }

    public void inputByUser() {
        System.out.print("Введите не пустую строку: ");
        try {
            String s = in.nextLine();
            if(s.equals("")) {
                throw new RuntimeException("Строка не должна быть пустой!");
            }
            System.out.println(s);
        } catch (Exception e) {
            throw new RuntimeException("Строка не должна быть пустой!");
        }
    }
}
