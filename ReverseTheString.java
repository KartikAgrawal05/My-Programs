

import java.util.Scanner;
 
public class ReverseTheString {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.println("Reversing the string the name in /\\same or /not/");
         System.out.println("The String is  =  nitin");
        String m = "nitin";
        int count=0;
        int i=0;
        int j=m.length()/2;
        while (i<j)  
        {
            if (m.charAt(i)==m.charAt(m.length()-i-1))
            {
                count++;
            }
            i++;
        }
        if(count==j)
        {
            System.out.println("yes");
            
        }
        else
        {
            System.out.println("no");
        }
}
}
 