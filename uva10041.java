import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
 		for(int i=1;i<=n;i++){
 			int n2=sc.nextInt(),sum=0,a[]=new int[n2];
 			for(int j=0;j<n2;j++)
 				a[j]=sc.nextInt();
 			Arrays.sort(a);
 			for(int len:a)
 				sum+=Math.abs(a[n2/2]-len);
 			System.out.println(sum);	 			
 		}       
    }
}
