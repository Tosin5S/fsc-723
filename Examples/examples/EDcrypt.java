import java.util.*;


public class EDcrypt {
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter text to be transmitted..."); //*
        
        String text = input.nextLine(); //"you are an intelligently bouyant boy"
        String textA = text.substring(0,(text.length()/2)); //first substring
        System.out.println(textA);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
		
        String textB = text.substring((text.length()/2), text.length() ); //second substring
        
        System.out.println(textB);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
        
        String textAl = textA.toLowerCase(); //*
        String textBl = textB.toLowerCase(); //*
        
        System.out.println(textAl);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
        System.out.println(textBl);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
        
        
        //replacing the vowels in each substring
        String textAlv = textAl.replace('a','5');
       		   textAlv = textAlv.replace('e','4');
       		   textAlv = textAlv.replace('i','3');
       		   textAlv = textAlv.replace('o','2');
       		   textAlv = textAlv.replace('u','1');
        
        System.out.println(textAlv); //*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
        
        
        //replacing part B vowels
        String textBlv = textBl.replace('a','5');
        	   textBlv = textBlv.replace('e','4');
        	   textBlv = textBlv.replace('i','3');
        	   textBlv = textBlv.replace('o','2');
        	   textBlv = textBlv.replace('u','1');

        System.out.println(textBlv);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
		
		
        int i;
        char [] textAlv_char = new char [textAlv.length()]; //converting substring textAlv to new character array textAlv_char
               	for (i = 0; i < textAlv.length(); i++) {
        		textAlv_char [i] = textAlv.charAt(i); //conversion takes place here
        		System.out.print(textAlv_char[i]);
        		}
        		System.out.print("\n");
        		System.out.println ("***************");
        		
        	for (i = 0; i < textAlv_char.length; i++) {
        		if (i == 0) {
        			char temp = textAlv_char[i];
        			textAlv_char [i] = temp;
        		}
        		//elements on even indices swapped with element on preceding indices
        		else if(i % 2 == 0) {
        			char temp = textAlv_char[i-1];
        			textAlv_char [i] = temp;
        		}
        		System.out.print (textAlv_char[i] + "\t");
        	}//next i
        	
        String new_textAlv = new String(textAlv_char); //converts aa_char back to a string
        		System.out.println(new_textAlv); //*
       
       
       char [] textBlv_char = new char [textBlv.length()]; //converting substring textBlv to new character array textBlv_char
               	for (i = 0; i < textBlv.length(); i++) {
        		textBlv_char [i] = textBlv.charAt(i); //conversion takes place here
        		System.out.print(textBlv_char[i]);
        		}
        		System.out.print("\n");
        		System.out.println ("***************");
        		
        	for (i = 0; i < textBlv_char.length; i++) {
        		if (i == 0) {
        			char temp = textBlv_char[i];
        			textBlv_char [i] = temp;
        		}
        		//elements on even indices swapped with element on preceding indices
        		else if(i % 2 == 0) {
        			char temp = textBlv_char[i-1];
        			textBlv_char [i] = temp;
        		}
        		System.out.print (textBlv_char[i] + "\t");
        	}//next i
        	
        String new_textBlv = new String(textBlv_char); //converts aa_char back to a string
        		System.out.println(new_textBlv); //*
        		
        		//concatenating the new strings (partB + partA)
        		System.out.println ("Encrypted text = " + (new_textBlv + new_textAlv));
        		
        		//encryption ends here...
        
        
        	
        
        
        
        
       
    }
}
