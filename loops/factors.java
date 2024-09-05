import java.util.*;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int numberOfFactors = 0;

        for(int i = 1; i <= x; i++){
            if(i == 0 || i == x){
                continue;
            }
            boolean isDivisible = x % i == 0;
        
            if(isDivisible == true){
               System.out.print(i + " ");
               numberOfFactors++;
            }
        }
        if(numberOfFactors == 0){
            System.out.println(-1);
        }
    }        

                    

    
}
