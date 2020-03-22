import java.util.*;
public class UVA10699 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			if(n==0) {
				break;
			}
			System.out.print(n+" : ");
			int A[]=new int [n+1];
			int i=2;
			
			while(n!=1) {
				if(n%i==0) {
					n/=i;
					A[i]++;
				}else {
					i+=1;
				}
			}
			int count=0;
			for(int j=0;j<A.length;j++) {
				if(A[j]!=0) {
					count+=1;
				}
			}
			System.out.println(count);
			
		}
	}
}
