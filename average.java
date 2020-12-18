import java.util.Scanner;
 public class average
    {
        public static void main(String[] args)
        {
            int x[]={50,60,80,90,100};
            int i=0;
            int total=0;
            while(i<5)
            {
                total=total+x[i];
                i++;
            }
            int average =total/5;
            System.out.println(average);
        }
    }