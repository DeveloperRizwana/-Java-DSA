public class binarySearch {
    // static int search(int[] arr, int st, int end,  int k){
    //     while (st <= end) {
    //         int mid = (st+end)/2;
    //         if (k == arr[mid]) {
    //             return mid;
    //         } else if(k > arr[mid]){
    //             st = mid+1;
    //         } else {
    //             end = mid-1;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int[] arr = {2, 4, 5, 7, 8, 9, 10, 11};
    //     System.out.println("Binary search: ");
    //     int ans = search(arr, 0, arr.length-1, 12);
    //     System.out.println(ans);
    // }
    static boolean search(int[] arr, int k){
        int st = 0, end = arr.length-1;

        while (st <= end) {
            int mid = (st+end)/2;
            if(k == arr[mid]){
                return true;
            } else if(k < arr[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Binary Search");
        int[] arr = {2, 4, 5, 6, 7};
        int k = 0;
        while (k != 10) {
            System.out.printf("%d exist in arr: %b \n", k, search(arr, k));
            k++;
        }
       
    }

}
