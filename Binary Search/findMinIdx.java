public class findMinIdx {
    static int minIdx(int[] arr, int st, int end){
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] > arr[end]){
                st = mid + 1;
            } else if(arr[mid] <= arr[end]){
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        System.out.println("Minimum index: ");
        System.out.println(minIdx(arr, 0, arr.length-1));
    }
    
}
