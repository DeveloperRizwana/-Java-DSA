public class solution {
    static int sum(int[] input, int idx){
        if(idx == input.length - 1){
            return input[idx];
        }
        int smallAns = sum(input, idx+1);
        return smallAns + input[idx];
    }
    public static void main(String[] args) {
        System.out.println("Sum of Array: ");
        int[] input = {9, 8, 9};
        System.out.println(sum(input, 0));
    }
    
}
