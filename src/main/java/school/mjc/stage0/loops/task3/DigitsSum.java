package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int tens = (t+"").length();
        int sum=0;
        for(int i = 1; i <= tens; i++){
            int number = t%((i-1)^10);
            sum+=number;

        }
        System.out.println(sum);
    }
}
