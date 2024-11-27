public class searchInMatrix {
    static boolean search(int[][] a, int k){
        int n = a.length, m = a[0].length;
        int st = 0, end = n * m - 1;
        while (st <= end) {
            int mid = st + (end - st)/2 ;
            int midElt = a[mid/m][mid%m];
            if(midElt == k) return true;
            if(midElt < k){
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.err.println("Result: ");
        int[][] a = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60},
        };
        System.err.println(search(a, 2));
    }
}
