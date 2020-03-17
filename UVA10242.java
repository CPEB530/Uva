import java.util.*;
public class UVA10242 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double[][] point = new double[3][2];
			int pos = 0;
			double repeatx = 0;
			double repeaty = 0;

			for(int i = 0 ; i<4; i++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				if(!contain(x,y,point,pos)) {
					point[pos][0] = x;
					point[pos][1] = y;
					pos++;
				}
				else {
					repeatx = x;
					repeaty = y;
				}
			}
			double resx = 0;
			double resy = 0;
			for(int i = 0 ; i<3; i++) {
				if(point[i][0]!=repeatx || point[i][1] != repeaty) {
					resx+=point[i][0];
					resy+=point[i][1];
				}
				else {
					resx-=point[i][0];
					resy-=point[i][1];
				}
			}
			System.out.printf("%.3f %.3f\n", resx,resy);
		}
	}
	static boolean contain(double x, double y,double[][] point,int pos) {
		for(int i = 0 ; i<pos; i++) {
			if(point[i][0] == x && point[i][1] == y)return true;
		}
		return false;
	}
}