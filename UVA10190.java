import java.util.*;
public class UVA10190 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if(m <= 1 || n <= 1) {
				System.out.println("Boring!");
				continue;
			}
			
			ArrayList<Integer> data = new ArrayList<Integer>();
			data.add(n);
			
			boolean boring = false;
			
			while(n!=1) {
				if(n%m == 0) {
					data.add(n/m);
					n/=m;
				}
				else {
					boring = true;
					break;
				}
			}
			
			if(boring) {
				System.out.println("Boring!");
			}
			else {
				for(int i = 0 ; i<data.size() ; i++) {
					if(i != 0) {
						System.out.print(" ");
					}
					System.out.print(data.get(i));
				}
				System.out.println();
			}
		}
	}
}