import java.util.*;

public class UVA11063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int kase = 1;
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] b = new int[n];
			boolean isB2 = true;
			for(int i=0;i<n;i++){
				b[i] = sc.nextInt();
				if(b[i] < 1 || (i > 0 && b[i-1] >= b[i]))
					isB2 = false;
			}
			
			if(isB2) {
				boolean[] appear = new boolean[20005];
				Arrays.fill(appear, false);
				
				for(int i=0;i<n;i++){
					for(int j=i;j<n;j++){
						int sum = b[i] + b[j];
						if(appear[sum]){
							isB2 = false;
						}
						else{
							appear[sum] = true;
						}
					}
				}
			}
			
			System.out.print("Case #" + kase + ": ");
			
			if(isB2)
				System.out.println("It is a B2-Sequence.");
			else
				System.out.println("It is not a B2-Sequence.");
			
			System.out.println();
			
			kase++;
		}
	}

}
