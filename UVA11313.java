import java.util.*;

public class UVA11313 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		
 		int t = sc.nextInt();
 		while(t-->0){
 			int n = sc.nextInt();
 			int m = sc.nextInt();
 			
 			int show = 0;
 			while(n >= m){
 				n = n - (m-1);
 				show++;
 			}
 				
 			if(n == 1)
 				System.out.println(show);
 			else
 				System.out.println("cannot do this");
 		}
	}

}
