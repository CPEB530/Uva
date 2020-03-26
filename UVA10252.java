import java.util.*;
public class UVA10252 {
	public static void UVA10252(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String a = sc.nextLine();
			String b = sc.nextLine();
			int[] a_alb = new int[26];
			int[] b_alb = new int[26];
			count(a,a_alb);
			count(b,b_alb);
			for(int i = 0 ; i<26; i++) {
				if(b_alb[i]!=0 && a_alb[i]!=0) {
					int min = Math.min(a_alb[i], b_alb[i]);
					for(int j = 0 ; j<min; j++) {
						System.out.print((char)(i + 'a'));
					}
				}
			}
			System.out.println();
		}
	}
	static void count(String target , int[]alb) {
		for(int i = 0 ; i<target.length(); i++) {
			if(target.charAt(i)-'a' < 0)continue;
			alb[target.charAt(i)-'a']++;
		}
	}
}