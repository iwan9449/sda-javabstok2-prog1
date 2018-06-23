package iwanczukp.recursion;

class Factorial {

    public static void main(String[] args) {
        int testValue = 5;

        System.out.println(iterationFactorial(testValue));
        System.out.println(recursionFactorial(testValue));
    }

    static int iterationFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int recursionFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recursionFactorial(n - 1);
    }

}
