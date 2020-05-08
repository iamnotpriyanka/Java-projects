import java.util.*;
public class CommonFactorOfIntegers{

      public static void main(String args[] ) throws Exception {
       
            Scanner s = new Scanner(System.in);
            long n = s.nextLong();   
            long m=s.nextLong();
            int small=0;
            int count=0;

            if(n==0 || m==0)
            {
                System.out.println(count);
                return;

            }

            if(n<m) 
            small=(int)n/2;
            
            else
            small=(int)m/2;
            count=1;

            for(int i=2;i<=small;i++) 
            {
                if(n%i==0 && m%i==0)
                count++;
            }
            if(n%m==0 || m%n==0)count++;

            System.out.println(count);    
            }
        }

            
        
