public class sumColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 5, 6},
                {5, 9, 8},
                {6, 1, 2}
        };
        int[] sumColumn = new int[3];
        for (int j = 0; j < matrix[0].length; j++) {

            for (int i = 0; i < matrix.length; i++) {
                sumColumn[j] += matrix[i][j];
            }
        }
        int maxSumColumn = sumColumn[0];
        for (int k = 1; k < sumColumn.length; k++) {
            if (sumColumn[k] > maxSumColumn) {
                maxSumColumn = sumColumn[k];
            }
        }
        System.out.println(maxSumColumn);
    }
}
