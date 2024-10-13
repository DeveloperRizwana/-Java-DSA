public class lec1 {
    static void prefSum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            System.out.print("The sum " + sum);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {1, 2, 3}
        };            
        prefSum(arr);
    }
    
}
