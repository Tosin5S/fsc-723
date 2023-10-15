import java.util.*;


public class DEcrypt {
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter text for decryption..."); //*
        String deText = input.nextLine(); //* g44ttyybb1155ttbbyy22  rr  nn33ttll3
        
        //substrings of original string; pay attention to the odd length of string
        
        String deTextB = deText.substring(0,((deText.length()- deText.length()/2))); //partB substring
        System.out.println(deTextB);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
		
        String deTextA = deText.substring(((deText.length()- deText.length()/2)), deText.length() ); //partA substring
        System.out.println(deTextA);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
		
		
		
        
        
        
        
        	
        
        
        
        
       
    }
}
