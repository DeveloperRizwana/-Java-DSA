public class codingPractice {
    static int index(int[] input, int x){
        return allIndices(input, x, 0);

    }
    static int allIndices(int[] input, int x, int idx){
        if(idx == input.length){
            return -1;
        }
        int result = allIndices(input, x, idx+1);
        if(input[idx] == x){
            return idx;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("all Indices: ");
        int[] arr = {2, 1, 1, 3, 4};
        System.out.println(index(arr, 1));
    }
    
}
