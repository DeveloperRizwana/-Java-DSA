public class findAllIndices {
    static void printAllIndices(int[] arr, int target, int idx){
        if(idx >= arr.length){
            return;
        } 
        if(arr[idx] == target){
            System.out.println(idx);
        }
        printAllIndices(arr, target, idx + 1);
    }
    public static void main(String[] args) {
        System.out.println("All indices: ");
        int[] arr = {1, 2, 2, 4, 2};
        printAllIndices(arr, 2, 0);
    }
    
}
