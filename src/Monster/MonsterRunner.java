package Monster;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
                System.out.print("Enter skeleton's name :: ");
		String name = keyboard.next();
                System.out.print("Enter skeleton's size :: ");
		int size = keyboard.nextInt();
                keyboard.nextLine();
		
		//instantiate monster one
                Skeleton s1 = new Skeleton(name, size, 1);
		
		//ask for name and size
                System.out.print("Enter ghost's name :: ");
		String n = keyboard.next();
                System.out.print("Enter ghost's size :: ");
		int s = keyboard.nextInt();
                keyboard.nextLine();
		
		//instantiate monster two
                Ghost s2 = new Ghost(n, s, 1);
                
                System.out.println("\n");
                System.out.println(s1.toString());
                System.out.println(s2.toString());
                System.out.println("\n");
                
                if(s1.isBigger(s2)){
                    System.out.println("Skeleton is bigger than Ghost");
                } else{
                    System.out.println("Skeleton is smaller than Ghost");
                }
                if(s1.namesTheSame(s2)){
                    System.out.println("Skeleton has the same name as Ghost");
                 
                }else{
                    System.out.println("Skeleton does not have the same name as Ghost");
                }
	}
}