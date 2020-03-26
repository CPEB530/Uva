import java.util.*;
public class UVA10282 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Map data = new TreeMap();
		while(sc.hasNext()) {
			String input = sc.nextLine();
			if(input.equals(""))break;
			String[] s = input.split(" ");
			data.put(s[1], s[0]);
		}
		while(sc.hasNext()) {
			String key = sc.next();
			if(!data.containsKey(key)) {
				System.out.println("eh");
			}
			else {
				System.out.println(data.get(key));
			}
		}
	}
}