public class removeOccurrences {
    static String remove(String s, int idx){
        // base case
        if(idx == s.length()){
            return "";
        }
        // recursive work
        String smallAns = remove(s, idx + 1);
        char cuurChar = s.charAt(idx);
        // self work
        if(cuurChar != 'a'){
            return cuurChar + smallAns;
        } else {
            return smallAns;
        }

    }
    public static void main(String[] args) {
        System.out.println("Removed occurrences: ");
        String s = "adcamh";
        System.out.println(remove(s, 0));
    }
    
}
