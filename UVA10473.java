import java.util.*;
public class UVA10473 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			String s=sc.next().toUpperCase();

			if(s.charAt(0)=='0'&&s.length()>=3) {
				s=s.substring(2,s.length());
				int val=HexToDec(s);
				System.out.println(val);
			}else {
				if(s.charAt(0)=='-') {
					break;
				}
				String str=DecToHex(s);
				System.out.println(str);
			}
		}
	}
	public static String DecToHex(String s) {         
		String ans="";
		int n=Integer.parseInt(s);
		int q=0;
		if(n>0) {
			while(n>0) {
				q=n%16;
				if(q<10) {
					ans=q+ans;
				}else {	
					char a=(char)('A'+q-10);
					ans=a+ans;	
				}
				n/=16;
			}
		}else {
			ans="0";
		}
		
		ans="0x"+ans;
		return ans;
	}
	public  static int HexToDec(String s) {
		int ans=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A'&&c<='F') {
				ans=ans*16+(c-'A'+10);
			}else {
				ans=ans*16+(c-'0');
			}
			
		}
		return ans;
	}
}

