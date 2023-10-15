import java.util.*;


public class ENcryptZ {
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
                
        String text = "you are an intelligently bouyant lady";
        String textA = text.substring(0,(text.length()/2)); //first substring
        String textB = text.substring((text.length()/2), text.length() ); //second substring
        
        //replacing the partA vowels
        String textAv = textA.replace('a','5');
       		   textAv = textAv.replace('e','4');
       		   textAv = textAv.replace('i','3');
       		   textAv = textAv.replace('o','2');
       		   textAv = textAv.replace('u','1');
            
        
        //replacing partB vowels
        String textBv = textB.replace('a','5');
        	   textBv = textBv.replace('e','4');
        	   textBv = textBv.replace('i','3');
        	   textBv = textBv.replace('o','2');
        	   textBv = textBv.replace('u','1');

        //converting substrings to character array for both substrings
        int i;
        char [] textAv_char = new char [textAv.length()]; //converting substring textAlv to new character array textAv_char
               	for (i = 0; i < textAv.length(); i++) {
        		textAv_char [i] = textAv.charAt(i); //conversion takes place here
        		}
        		
        	for (i = 0; i < textAv_char.length; i++) {
        		if (i == 0) {
        			char temp = textAv_char[i];
        			textAv_char [i] = temp;
        			//though index 0 is an even index, it will retain its position as there is no preceding odd index to swap with
        		}
        		//elements on even indices swapped with element on preceding indices
        		else if(i % 2 == 0) {
        			char temp = textAv_char[i-1];
        			textAv_char [i] = temp;
        		}
        		
        	}//next i
        	
        String new_textAv = new String(textAv_char); //converts textAv_char back to a string
        		
       
       
       char [] textBv_char = new char [textBv.length()]; //converting substring textBlv to new character array textBv_char
               	for (i = 0; i < textBv.length(); i++) {
        		textBv_char [i] = textBv.charAt(i); //conversion takes place here
        		}
        		
        		
        	for (i = 0; i < textBv_char.length; i++) {
        		if (i == 0) {
        			char temp = textBv_char[i];
        			textBv_char [i] = temp;
        		}
        		//elements on even indices swapped with element on preceding indices
        		else if(i % 2 == 0) {
        			char temp = textBv_char[i-1];
        			textBv_char [i] = temp;
        		}
        		
        	}//next i
        	
        String new_textBv = new String(textBv_char); //converts textBv_char back to a string
        		
        		
        		//concatenating the new strings (partB + partA)
        		System.out.println ("Encrypted text = " + (new_textBv + new_textAv));
        		
        		//encryption ends here...
        
        
        	
        
        
        
        
       
    }
}
