//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		//file.nextLine();
		
                Comparable[] arr = new Comparable[size];
                for(int i = 0; i<arr.length; i++){
                    arr[i] = file.nextLine();
                }
                Arrays.sort(arr);
                for(int n = 0; n<arr.length; n++){
                    System.out.println(arr[n]);
                }


	}
}