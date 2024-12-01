public class findFloorAndCeil {
    static int[] getFloorAndCeil(int[] a, int x){
        int floor = Integer.MIN_VALUE, ceil = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++){
           if(a[i] <= x && floor < a[i]){
            floor = a[i];
           } 
           if(a[i] >= x && ceil > a[i]){
            ceil = a[i];
           }
        }
        if(floor == Integer.MIN_VALUE) {
            floor = -1;
        }
        if(ceil == Integer.MAX_VALUE){
            ceil = -1;
        }
        return new int[]{floor, ceil};

    }
    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7;
        int[] result = getFloorAndCeil(a, x);

        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }
    
}
