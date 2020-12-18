
    import java.util.Scanner;
    public class  CompoundInterest2
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
    float m;
    
     while( z>0)
     {
         l=x*y/100;
         z--;
       System .out.println("Compound Interest="+l);
         m= l+x;
        System .out.println("Amount="+m);
          
          x=l;
           
        }
       
    }
    }

