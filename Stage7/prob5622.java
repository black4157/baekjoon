import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob5622 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		s = s.toUpperCase();
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') {
				count += 3;
			} else if(s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F') {
				count += 4;
			} else if(s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I') {
				count += 5;
			} else if(s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L') {
				count += 6;
			} else if(s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O') {
				count += 7;
			} else if(s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S') {
				count += 8;
			} else if(s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V') {
				count += 9;
			} else if(s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z') {
				count += 10;
			} else {
				count += 2;
			}
		}
		System.out.print(count);
	}
}
