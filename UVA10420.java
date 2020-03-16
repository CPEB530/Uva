import java.util.*;
public class UVA10420{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String C[]=new String[t];
		sc.nextLine();
		
		for(int i=0;i<t;i++){
			String s[]=sc.nextLine().trim().split(" ");
			C[i]=s[0];
		}
		Arrays.sort(C);
		
		int count=1;
		String now=C[0];
		for(int i=1;i<t;i++) {
			if(C[i].equals(now)) {
				count++;
			}else {
				System.out.println(now+" "+count);
				now=C[i];
				count=1;
				
			}
			if(i==t-1) {
				System.out.println(now+" "+count);
			}
			
		}	
		
	}
}
