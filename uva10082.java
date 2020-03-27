import java.util.*;

class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		String table="`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		
		while(sc.hasNextLine()){
			String st=sc.nextLine();
			
			for(int i=0;i<st.length();i++){
				if(st.charAt(i)==' ') System.out.print(" ");
				for(int j=0;j<table.length();j++){
					if(table.charAt(j)==st.charAt(i)){
						System.out.print(table.charAt(j-1));
						break;
					}
					
				}
				
			}
			
			System.out.println("");
		}
	}
}