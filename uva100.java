import java.util.*;
class main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			int c=0;
			int a=sc.nextInt(),b=sc.nextInt();
			int min=Math.min(a,b);
			int max=Math.max(a,b);
			for(int i=min;i<=max;i++){
			int count=1;
				int j=i;
				while(j!=1){
				if(j%2==0)
					j/=2;
				else
					j=3*j+1;
				count++;
				}		
				if(c<count)
					c=count;
			}
			System.out.println(a+" "+b+" "+c);
		}
	}
	
}
