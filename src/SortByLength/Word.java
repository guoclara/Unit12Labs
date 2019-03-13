//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
            word = s;
	}

	public int compareTo( Word rhs )
	{		
            if(word.length()>rhs.word.length()){
                return 1;
            } else if (word.length()<rhs.word.length()){
                return -1;
            } else{
                int bound = 0;
                if(word.length()<rhs.word.length()){
                    bound = word.length();
                }else{
                    bound = rhs.word.length();
                }
                for(int i = 0; i<bound; i++){
                    if(word.charAt(i)>rhs.word.charAt(i)){
                        return 1;
                    } else if(word.charAt(i)>rhs.word.charAt(i)){
                        return -1;
                    } else if(i==bound - 1 && word.length()==rhs.word.length()){
                        return 0;
                    } else if(i==bound - 1 && word.length()!=rhs.word.length()){
                        if(word.length()<rhs.word.length()){
                            return 1;
                        } else{
                            return -1;
                        }
                    }
                }
            } return 0;
            //return this.word.length() - rhs.toString().length();
	}

	public String toString()
	{
		return word;
	}
}