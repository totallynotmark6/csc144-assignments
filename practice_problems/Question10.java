package practice_problems;

import java.util.Scanner;

public class Question10 {
    /**
     * Prints a triangle of stars, with 1 star on the first line, 2 on the second, which are separated by tabs. The
     * triangle is mirrored across the y-axis.
     * @param n the number of stars on the first line
     */
    public static void starTriangleMirror(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" \t".repeat(n - i));
            System.out.println("*\t".repeat(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        starTriangleMirror(n);
    }
}