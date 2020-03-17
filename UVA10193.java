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
		int v = 0;
		int p = 1;
		for(int i = s.length()-1; i>=0; i--) {
			v += (s.charAt(i) - '0') * p;
			p *= 2;
		}
		return v;
	}
	
	static int gcd(int v1, int v2) {
		if(v2 == 0 )
			return v1;
		else
			return gcd(v2, v1%v2);
	}
}