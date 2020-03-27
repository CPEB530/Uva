import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        for(int i=1;i<=c;i++){
        	int day=sc.nextInt(),p=sc.nextInt(),a[]=new int[p],count=0;
         	for(int j=0;j<p;j++)
         		a[j]=sc.nextInt();
         	for(int j=1;j<=day;j++){
         		if(j%7!=6&&j%7!=0)
         			for(int k=0;k<p;k++)
         				if(j%a[k]==0){
         					count++;
         					break;
         				}
         	}
         	System.out.println(count);
        }
    }
}
