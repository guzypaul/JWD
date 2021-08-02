package by.guzypaul.branchingandloop.service.branching;

/**
 * @author Guzy Paul
 * Task17 (branching): compare two numbers (int m,int n). if n!=m -> n = max(n,m), m = max(n,m)  ;
 * if n==m -> n = 0, m = 0;
 */

public class ComplexComparator {
    private int m;
    private int n;

    /**
     * @param m, n;
     */
    public void compareAndChangeNumbers(int m, int n) {
        if (m != n) {
            this.m = Math.max(m, n);
            this.n = Math.max(m, n);
        } else {
            this.m = 0;
            this.n = 0;
        }
    }
}