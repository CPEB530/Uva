import java.util.*;
public class UVA10474 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=1;
		while(sc.hasNext()) {
			
			int n=sc.nextInt();
			int q=sc.nextInt();
			if(n==0&&q==0) {
				break;
			}
			System.out.println("CASE# "+t++ +":");
			int []sum=new int [10001];
			int []count=new int [10001];
			int l=0;
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				count[x]++;
				if(x>l) {
					l=x;
				}
			}
			for(int i=1;i<=l;i++) {
				sum[i]=sum[i-1]+count[i-1];
			}
			for(int i=0;i<q;i++) {
				int m=sc.nextInt();
				if(count[m]!=0) {
					System.out.println(m+" found at "+(sum[m]+1));
				}else {
					System.out.println(m+" not found");
				}
			}
			
		}
	}

}
