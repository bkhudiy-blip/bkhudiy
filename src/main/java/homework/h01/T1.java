package homework.h01;

// Smallest Even Multiple
// https://leetcode.com/problems/smallest-even-multiple/
public class T1 {
  public int smallestEvenMultiple(int n) {
        return n + (n % 2) * n;
    }
}
