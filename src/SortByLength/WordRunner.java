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
		
                ArrayList<Word> arr = new ArrayList<Word>();
                for(int i = 0; i<arr.size(); i++){
                    arr.add(new Word(file.nextLine()));
                }
                for(int x = 0; x<size; x++){
			for(int n = 1; n<size;n++){
				if(arr.get(n).compareTo(arr.get(n-1) == -1) {
					Collections.swap(arr, n, n-1);
				}
					
			}
		}
				   
		for(int i = 0; i<sisze; i++){
			System.out.println(arr.get(i).toString());
		}



	}
}
