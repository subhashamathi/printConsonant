
public class printConsonants 	
{
    public static void main(String[] args)
    {
    	printConsonants.printConsonants("Hello");
    }
    static void printVowels(String s)
    {
    	 String vowels="aeiouAEIOU";
    	 for(int i=0;i<s.length();i++)
    	 {
    		   if(vowels.indexOf(s.charAt(i))!=-1)
    		   {
    			   System.out.println(s.charAt(i));
    		   }
    	 }
    }
     static void printConsonants(String s)
     {
    	 String consonants = "bcdfghjlmnpqrstvwxyzBCDFGHJLMNPQRSTVWYZ";
    	 for(int i=0;i<s.length();i++)
    	 {
    		 if(consonants.indexOf(s.charAt(i))!=-1)
    		 {
    			 System.out.println(s.charAt(i));
    		 }
    		 
    	 }
     }

}


