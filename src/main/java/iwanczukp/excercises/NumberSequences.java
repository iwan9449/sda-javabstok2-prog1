package iwanczukp.excercises;

import iwanczukp.recursion.FibonacciSequence;

class NumberSequences {

    public static void main(String[] args) {
        int testValue = 10;

        firstSequence(testValue);
        secondSequence(testValue);
        thirdSequence(testValue);
        fourthSequence(testValue);

    }

    // 1, 3, 5, 7, 9, 11, 13, 15, 17, 19
    static void firstSequence(int n) {
        int counter = 0;
        for (int i = 0; counter < n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");
                counter++;
            }
        }
        System.out.println();
    }

    // -1, 1, 5, 13, 29, 61, 125, 253, 509, 1021
    static void secondSequence(int n) {
        for (int i = 1; i <= n; i++) {
            int number = ((int) Math.pow(2, i)) - 3;
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    // 2, 4, 6, 8, 6, 4, 2, 4, 6, 8
    static void thirdSequence(int n) {
        boolean isGrowing = true;
        int number = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(number + ", ");
            if (isGrowing) {
                number += 2;
            } else {
                number -= 2;
            }
            if (number == 8 || number == 2) {
                isGrowing = !isGrowing;
            }
        }
        System.out.println();
    }

    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    static void fourthSequence(int n) {
        for (int i = 1; i <= n; i++) {
            // Nie ma sensu na nowo wymyślać koła więc skorzystam z metody, którą stworzyliśmy w poprzenim zadaniu :)
            System.out.print(FibonacciSequence.iterationFibonacciSequence(i) +  ",");
        }
        System.out.println();
    }

}
