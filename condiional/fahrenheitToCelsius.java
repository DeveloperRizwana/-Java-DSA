import java.util.*;
public class fahrenheitToCelsius {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();

		for(int i = s; i <= e; i = i + w){
			System.out.println(i + " " + ((i - 32)*5)/9);
		}
	}

}
