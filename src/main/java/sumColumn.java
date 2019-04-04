
import java.util.Scanner;

public class sumColumn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter row of matrix: ");
        int row = scanner.nextInt();
        System.out.print("enter column of matrix: ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

        inputMatrix(matrix, row, column);

        showMatrix(matrix, row, column);

       int[] sumColumn = new int[column];
        for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {

            for (int[] ints : matrix) {
                sumColumn[columnIndex] += ints[columnIndex];
            }
        }
        int maxSumColumn = sumColumn[0];
        int indexOfMaxSumColumn = 0;
        for (int k = 0; k < sumColumn.length; k++) {
            if (sumColumn[k] > maxSumColumn) {
                maxSumColumn = sumColumn[k];
                indexOfMaxSumColumn = k;
            }
        }
        System.out.println(indexOfMaxSumColumn + " is max which sum is: " + maxSumColumn);


    }

    private static void inputMatrix(int[][] matrix, int row, int column) {
        Scanner scanner = new Scanner(System.in);
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
                System.out.print("element at row " + rowIndex + " and column " + columnIndex + " is: ");
                 matrix[rowIndex][columnIndex] = scanner.nextInt();
            }
        }
    }

    private static void showMatrix(int[][] matrix, int row, int column) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
