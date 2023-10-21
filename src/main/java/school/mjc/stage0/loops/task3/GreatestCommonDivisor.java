package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int a = first;
        int b = second;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}
