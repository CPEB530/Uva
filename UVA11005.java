import java.util.*;

public class UVA11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  		
  		int t = sc.nextInt();
  		for(int kase = 1;kase <= t;kase++){
  		
  			int cost[] = new int[36];
  			for(int i=0;i<36;i++) {
  				cost[i] = sc.nextInt();
  			}
  				
  			System.out.println("Case " + kase + ":");
  			
  			int q = sc.nextInt();
  			while(q-- > 0){
  				int y = sc.nextInt();
  				int sum[] = new int[37];
  				int min = Integer.MAX_VALUE;
  				for(int base = 2 ; base <= 36 ; base++){
  					int n = y;
  					while(n>0) {
  						int r = n % base;
  						sum[base] = sum[base] + cost[r];
  						n = n / base;
  					}
  					
  					if(sum[base] < min)
  						min = sum[base];
  				}
  				
  				System.out.print("Cheapest base(s) for number " + y + ":");
  				for(int i = 2;i <= 36;i++){
  					if(sum[i] == min)
  						System.out.print(" " + i);
  				}
  				System.out.println();
  			}
  			if(kase != t)
  				System.out.println();
  		}
	}

}
