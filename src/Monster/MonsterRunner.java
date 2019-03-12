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
                System.out.print("Enter 1st monster's name :: ");
		String name = keyboard.next();
                System.out.print("Enter 1st monster's size :: ");
		int size = keyboard.nextInt();
		
		//instantiate monster one
                Skeleton s1 = new Skeleton(name, size, 1);
		
		//ask for name and size
                System.out.print("Enter 2nd monster's name :: ");
		String n = keyboard.next();
                System.out.print("Enter 2nd monster's size :: ");
		int s = keyboard.nextInt();
		
		//instantiate monster two
                Skeleton s2 = new Skeleton(n, s, 2);
                
                if(s1.isBigger(s2)){
                    System.out.println("Monster One is bigger than Monster Two");
                } else{
                    System.out.println("Monster One is smaller than Monster Two");
                }
                if(s1.namesTheSame(s2)){
                    System.out.println("Monster One has the same name as Monster Two");
                 
                }else{
                    System.out.println("Monster One does not have the same name as Monster Two");
                }
	}
}