import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	int count=0,carry=0;
        	int a=sc.nextInt(),b=sc.nextInt();
        	if(a==0||b==0)
        		break;
        	while(a!=0||b!=0){
        		int sum=carry+a%10+b%10;
        		if(sum>=10)
        			count++;
        		carry=sum/10;
        		a/=10;
        		b/=10;
        	}
        	if(count==0)
        		System.out.println("No carry operation.");
        	else if(count==1)
        		System.out.println("1 carry operation.");
        	else
        		System.out.println(count+" carry operations.");
        }
    }
}
