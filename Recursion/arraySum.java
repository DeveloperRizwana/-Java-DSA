public class arraySum {
    static int printArraySum(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        int smallAns = printArraySum(arr, idx + 1);
        return arr[idx] + smallAns;
    }
    public static void main(String[] args) {
        int[] arr  = {2, 3, 5, 20, 1};
        System.out.println("Sum of Array " + printArraySum(arr, 0));
    }
    
}
