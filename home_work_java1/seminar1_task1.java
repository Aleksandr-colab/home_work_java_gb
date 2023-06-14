// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120
package home_work_java1;

import java.util.Scanner;

class Task_01 {
    static int getTriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Enter natural number: ");
        if (!scn.hasNextInt()) {
            System.out.println("You entered wrong number!!!");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("You should enter positive number only!!!");
            else {
                System.out.printf("The triangle number of %d is: %s! ", n, getTriangleNumber(n));
                System.out.println();
                System.out.printf("The factorial of %d is: %s! ", n, getFactorial(n));
            }
        }
        scn.close();
    }
}