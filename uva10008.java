import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n+1];
        int a[]=new int[26];
        for(int i=0;i<=n;i++){
        	s[i]=sc.nextLine().toUpperCase();
        }
        for(int i=0;i<s.length;i++){
        	for(int j=0;j<s[i].length();j++){
        		if(Character.isLetter(s[i].charAt(j))){
        			int b=s[i].charAt(j)-'A';
        			a[b]++;
        		}
        	}
        }
        int max=0;
        for(int i=0;i<26;i++)
        	if(max<a[i])
        		max=a[i];
       	while(max>0){
       		for(int i=0;i<26;i++){
       			if(a[i]==max)
       				System.out.println((char)(i+'A')+" "+a[i]);
       		}
       		max--;
       	}
    }
}
