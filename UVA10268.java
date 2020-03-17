import java.util.*;
public class UVA10268 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long x = sc.nextLong();
			sc.nextLine();
			String[] s = sc.nextLine().split(" +");
			
			long res = 0;
			long v = 1;
			for(int i = s.length-2, k = 1 ; i>=0 ; i-- , k++) {
				res+= Long.parseLong(s[i])*k * v;				
				v*=x;
			}
			
			System.out.println(res);
		}
	}
}