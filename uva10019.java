import java.util.*;
    public class main{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                String s=sc.next();
                String a=Integer.toString(Integer.parseInt(s),2);
                int count=0,count2=0,sum=0;
                for(int j=0;j<a.length();j++){
                    if(a.charAt(j)=='1')
                        count++;
                }
                System.out.print(count+" ");
                for(int j=s.length()-1;j>=0;j--){
                    sum+=Math.pow(16,j)*(s.charAt(s.length()-1-j)-'0');

                }
                String a2=Integer.toString(sum,2);
                for(int j=0;j<a2.length();j++){
                    if(a2.charAt(j)=='1')
                        count2++;
                }
                System.out.println(count2);

            }
        }
    }
