import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	long number=sc.nextLong(),day=sc.nextLong();
        	long i=number;
        	while(i<day){ 
        		number++;      		
        		i+=number;
        	}
        	System.out.println(number);
        }
    }
};

