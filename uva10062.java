import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(sc.hasNextLine()){
      		if(n++!=0)
      			System.out.println();
      		String s=sc.nextLine();
      		int arr[]=new int[127];
      		for(int i=0;i<s.length();i++)
      			arr[s.charAt(i)]++;
      		int max=0;
      		for(int i=0;i<arr.length;i++){
      			if(max<arr[i])
      				max=arr[i];
      		}
      		for(int i=1;i<=max;i++){
      			for(int j=arr.length-1;j>=0;j--){
      				if(arr[j]==i)
      					System.out.println(j+" "+i);
      			}
      		}
        }
    }
};
