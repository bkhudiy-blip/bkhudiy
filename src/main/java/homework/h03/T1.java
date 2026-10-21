package homework.h03;
import java.util.Arrays;

// base
// https://leetcode.com/problems/roman-to-integer/
public class T1 {
    public double average(int[] salary) {
        Arrays.sort(salary);

        double total = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            total += salary[i];
        }

        return total / (salary.length - 2);
    }
}