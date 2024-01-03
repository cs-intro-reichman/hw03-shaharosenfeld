/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String newWord= "" + s.charAt(0);
        for(int i=0;i< s.length()-1; i++)
        {
            for(int j=0; j<newWord.length();j++)
            {
                
                if (newWord.charAt(j)==s.charAt(i)) {
                j=newWord.length()+10;
                }
                if(j==newWord.length()-1)
                {   
                    newWord=newWord+s.charAt(i);
                }
                if(s.charAt(i)==' ')
                {
                    newWord=newWord+s.charAt(i);
                    j=newWord.length()+10;
                }
            }
        }
       return newWord;
    }
}
