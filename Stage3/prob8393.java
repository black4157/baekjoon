import java.util.*;

public class prob8393 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int sum=0;
		
		for (int i = 1; i<=a; i++) {
			sum += i;
		}
		
		System.out.print(sum);
	}
}
