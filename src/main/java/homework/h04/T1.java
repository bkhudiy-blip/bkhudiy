package homework.h04;

// base
// https://leetcode.com/problems/plus-one/
public class T1 {
    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0;
        while (n != 0) {
            n &= n - 1;
            count++;
        }
        return count;
    }
}