import java.util.*;
public class UVA10193 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int kase = 1;
		while(N-- > 0) {
			System.out.print("Pair #"+ kase++ +": ");
			String s1 = sc.next();
			String s2 = sc.next();
			int v1 = getValue(s1);
			int v2 = getValue(s2);
			int res = gcd(v1,v2);
			if(res != 1) {
				System.out.println("All you need is love!");
			}
			else {
				System.out.println("Love is not all you need!");
			}
		}
	}
	
	static int getValue(String s) {
		int sum = 0;
		for(int i = 0 ; i<s.length(); i++) {
			sum = sum * 2 + s.charAt(i) - '0';
		}
		return sum;
	}
	
	static int gcd(int v1, int v2) {
		if(v2 == 0 )
			return v1;
		else
			return gcd(v2, v1%v2);
	}
}