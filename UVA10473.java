import java.util.*;
public class UVA10473 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			String s=sc.next();

			if(s.charAt(0)=='0'&&s.length()>=3) {
				s=s.substring(2,s.length());
				int val=Integer.valueOf(s,16);
				System.out.println(val);
				
			}else {
				int Num=Integer.parseInt(s);
				if(Num<0) {
					break;
				}
				String str=Integer.toHexString(Num).toUpperCase();
				System.out.println("0x"+str);
				
				
			}
		}
		
	}

}
