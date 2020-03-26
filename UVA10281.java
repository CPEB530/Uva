import java.util.*;
public class UVA10281 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double speed = 0, dis = 0;
		double h = 0, m = 0, sec = 0;
		double time = 0, time2 = 0;
		
		while(sc.hasNext()){
			String input = sc.nextLine();
			boolean change = false;
			
			h = Double.parseDouble(input.substring(0,2));
			m = Double.parseDouble(input.substring(3,5));
			sec = Double.parseDouble(input.substring(6,8));
			
			time2 = sec/3600 + m/60 + h;
			
			dis += speed * ( time2- time);
			if(input.length() > 8){
				speed = Double.parseDouble(input.substring(9,input.length()));
			}
			else {
				System.out.printf("%s %.2f km\n",input, dis);
			}
			time = time2;
		}
	}
}