// Last updated: 2/24/2026, 4:30:07 PM
class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int[] a = new int[n + 1]; 
        a[1]=1;
        a[2]=2;
        for (int i = 3; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
       return a[n];
    }
}