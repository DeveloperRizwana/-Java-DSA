import java.util.Scanner;


public class problem1 {
   
    static int findNumber(int[] arr){
        int n = arr.length;
        int unique = 0;
       
        for(int i = 0; i < n; i++){
            unique ^= arr[i];
        }  
        return unique;
           
    }    
    
    public static void main(String[] args) {
        System.out.println("Enter size of an Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    //    int[] arr = {1, 2, 2, 1, 3};
        int ans = findNumber(arr);
        System.out.println("Unique element " + ans);
    }
    
}
