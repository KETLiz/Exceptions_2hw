package task3;

public class Program {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a/b);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!!!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable e) {
            System.out.println("Что-то пошло не так...");
        }
        
    }
}
