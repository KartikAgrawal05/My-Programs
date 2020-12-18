import java.util.Scanner;
public class GreaterNo
{
    public static void main(String[]args)
{
    Scanner read=new Scanner(System.in);
    System.out.println("Enter^^^The^^Three^^^No");
    System.out.println("Which No Is Greatest ");
    
    
    
    
    System.out.println("Write The First No.");
int x=read.nextInt();
System.out.println("Write The Second No.");
int y=read.nextInt();
System.out.println("Write The Third No.");
int z=read.nextInt();
int l;
 if (x>y)
 {
 if(x>z)
     {
          System . out.println(x+"it is the Greatest no.");
        }
        else
        System . out.println(z+"it is the Greatest no.");
        } 
        if(y>z)
        {
                System . out.println(y+"it is the Greatest no.");
        }
        else
        System . out.println(z+"it is the Greatest no.");
        } 
    }
