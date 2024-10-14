import java.util.*;
public class totalSumOfMat {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void findTotalSum(int[][] mat){
        int r = mat.length;
        if(r == 0){
            return;
        }
        int c = mat[0].length;
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;
        int sum = 0;
        while(totalElements < r * c){

            // topRow
            for(int j = leftCol; j <= rightCol && totalElements < r * c; j++){
                sum += mat[topRow][j];
                totalElements++;
            }
            topRow++;

            // rightCol
            for(int i = topRow; i <= bottomRow && totalElements < r * c; i++){
                sum += mat[i][rightCol];
                totalElements++;
            }
            rightCol--;

            // bottomRow
            for(int j = rightCol; j >= leftCol && totalElements < r * c; j--){
                sum += mat[bottomRow][j];
                totalElements++;
            }
            bottomRow--;

            // leftCol
            for(int i = bottomRow; i >= topRow && totalElements < r * c; i--){
                sum += mat[i][leftCol];
                totalElements++;
            }
            leftCol++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        printMatrix(matrix);

        // rotate(matrix, r);
        System.out.println("Spiral order");
        findTotalSum(matrix);
    }
    
}
