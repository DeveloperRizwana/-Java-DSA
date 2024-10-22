public class codingPractice {
    static boolean isPalindrome(String str){
        if(str.length() == 0 || str.length() == 1) return true;

        char curChar = str.charAt(0);
        char laString = str.charAt(str.length()-1);
        if(curChar == laString){
            return isPalindrome(str.substring(1, str.length()-1));

        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Palindrome: ");
        String str = "asba";
        System.out.println(isPalindrome(str));

    }
    
}
