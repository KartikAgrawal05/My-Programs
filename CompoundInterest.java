import java.util.Scanner;
public class CompoundInterest
{
    public static void main(String[]args)
{
  Scanner read=new Scanner(System.in);
  System.out.println("Find C.I");
   System . out.println("principal");
  float  x=read.nextInt();
    System . out.println("Rate");
float   y=read.nextInt();
 System . out.println("Time");
float  z=read.nextInt();
float l;
l=(x*y/100);
float m;
m= l+x;
float n;
n = m;

 while( m>z)
 {
    while(l>z)
     {
         System.out.println("TOTAL CI = "+ (z=z*l));
          l--;
        }
        
          System.out.println("AMOUNT ="+(z=z*m));
          m--;
           
        }
    }
    
    }