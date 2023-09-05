package task4;
/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя
 */
public class Program {
    public static void main(String[] args) {
        Solve solve = new Solve();
        solve.inputByUser();
    }
}
