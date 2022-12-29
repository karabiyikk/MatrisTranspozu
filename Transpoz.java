package Diziler;

import java.util.Arrays;

public class Transpoz {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[j][i] = A[i][j];

            }
        }
        System.out.println("A matrisi : ");
        for (int[] i : A) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Transpozu => B : ");
        for (int[] i : B) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
