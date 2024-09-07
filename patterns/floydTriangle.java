import java.util.*;

public class floydTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int number = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();    
        }
    }        
    
}
