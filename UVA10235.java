import java.util.*;
public class UVA10235 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
				
		boolean[] isPrime = new boolean[1000001];
		isPrime[0] = false; isPrime[1] = false;
		
		for(int i = 2; i<isPrime.length; i++) {
			isPrime[i] = true;
			for(int j = 2 ; j*j<= i; j++) {
				if(i%j == 0) {
					isPrime[i] = false;
					break;
				}
			}
		}

		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(isPrime[n]) {
				int reverse = 0;
				int nc = n;
				while(nc>0) {
					reverse *= 10;
					reverse += nc % 10;
					nc /= 10;
				}
				if(reverse != n && isPrime[reverse]) {
					System.out.println(n+" is emirp.");
				}
				else {
					System.out.println(n+" is prime.");
				}
			}
			else {
				System.out.println(n+" is not prime.");
			}
		}
	}
}