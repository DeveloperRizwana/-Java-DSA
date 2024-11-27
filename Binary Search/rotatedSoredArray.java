public class rotatedSoredArray {
    static int search(int[] a, int st, int end, int k){
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(a[mid] == k){
                return mid;
            } else if(a[mid] < a[end]){
                if(k > a[mid] && k <= a[end]){
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(k >= a[st] && k < a[mid]){
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println("Result: ");
        System.out.println(search(a, 0, a.length-1, 9));
    }
    
}
