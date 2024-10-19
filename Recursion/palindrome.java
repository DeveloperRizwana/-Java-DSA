public class palindrome {
    static boolean isPlaindrome(String s, int l, int r){
        if(l >= r) return true;

        return (s.charAt(l) == s.charAt(r) && isPlaindrome(s, l+1, r-1));
    }
    public static void main(String[] args) {
        String s = "rizu";
        System.out.println(isPlaindrome(s, 0, s.length() - 1));
    }
    
}
