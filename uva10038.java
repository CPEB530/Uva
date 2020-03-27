import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	int n=sc.nextInt();       	
        	if(n!=1){
        		int a[]=new int[n],a2[]=new int[n-1];
        		boolean b=true;
        		for(int i=0;i<n;i++){
        			a[i]=sc.nextInt();
        		}
        		for(int i=0;i<n-1;i++){
        			int d=Math.abs(a[i]-a[i+1]);
        			if(d<1||d>n-1){
        				b=false;
        				break;
        			}
        			for(int j=0;j<n-1;j++){
        				if(d==a2[j]){
        					b=false;
        					break;
        				}
        			}
        			a2[i]=d;
        		}
        		if(b)
        			System.out.println("Jolly");
        		else
        			System.out.println("Not jolly");
        	}
        	else{
        		System.out.println("Jolly");        		       	
        		n=sc.nextInt();
        	}
        }
    }
}
