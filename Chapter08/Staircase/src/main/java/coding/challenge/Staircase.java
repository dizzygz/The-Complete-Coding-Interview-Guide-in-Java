package coding.challenge;
 
public final class Staircase {

    private Staircase() {
        throw new AssertionError("Cannot be instantiated");
    }

    // 100% recursive
    public static int count(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }

        return count(n - 1) + count(n - 2) + count(n - 3);
    }

    // optimize the recursive algorithm via Memoization
    public static int countViaMemoization(int n) {

        int[] memo = new int[n + 1];
        return count(n, memo);
    }

    private static int count(int n, int[] memo) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else if (memo[n] > 0) {
            return memo[n];
        }

        memo[n] = count(n - 1, memo) + count(n - 2, memo) + count(n - 3, memo);

        return memo[n];
    }
}
