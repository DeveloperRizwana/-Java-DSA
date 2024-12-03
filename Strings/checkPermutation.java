public class checkPermutation {
    public static boolean isPermutation(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        if(str1.length() != str2.length()) return false;
        int[] arr = new int[125];
        for(int i = 0; i < str1.length(); i++){
                arr[str1.charAt(i)]++;
                arr[str2.charAt(i)]--;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) return false;
        }
       
        return true;
    }    
    public static void main(String[] args) {
        System.out.println("result: ");
        String str1 = "abcde";
        String str2 = "baedc";
        System.out.println(isPermutation(str1, str2));
    }
    
}
