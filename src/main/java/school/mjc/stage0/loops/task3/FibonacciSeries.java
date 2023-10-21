package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        int c;
        int count = 2;

        // Print the first two terms
        System.out.println(a);
        System.out.println(b);

        while (count < lastFibonacci) {
            c = a + b;
            System.out.println(c);

            a = b;
            b = c;
            count++;
        }
    }
}
