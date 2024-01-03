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
       
        /*for(int i =1; i<=s.length()-1; i++)
        {
            int j =0;
            if(i!=s.length()-1)
            {
                 j = i+1;
            }
            else{
                 j=0;
                 newWord= newWord+s.charAt(i);
            }
            if(s.charAt(i)==' ')
            {
                 j=0;
                newWord= newWord+s.charAt(i);
            }
            while(j!= 0)
            {
             if(s.charAt(i) == s.charAt(j))
                {
                    j=-1;
                } 
             if(j == s.length()-1)
                {
                    newWord= newWord+s.charAt(i);
                    j=-1;
                }
                j++;
            }   
        }
       //  newWord = newWord + s.charAt(s.length()-1);
        return newWord; */
    }
}
