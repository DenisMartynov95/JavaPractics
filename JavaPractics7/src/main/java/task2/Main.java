package task2;

public class Main {

    public static void main(String [] args) {
        Echo e1 = new Echo();

        ...

        int x = 0;
        while (...) {
            e1.hello();
            ...
            if(...) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);

    }
}
