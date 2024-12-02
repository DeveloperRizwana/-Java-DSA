import java.util.*;
public class toggleAllCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle -> capital letter to small and small letter to capital
        for(int i = 0; i < str.length(); i++){
            boolean flag = true;
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci >= 97) flag = false;
            if(flag == true){ // capital
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);

            }else {
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }    
        }
        System.err.println(str);
    }
    
}
