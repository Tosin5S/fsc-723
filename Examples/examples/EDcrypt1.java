import java.util.*;


public class EDcrypt1 {
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter text to be transmitted..."); //*
        
        String msgTrn = input.nextLine(); //"you are an intelligently bouyant boy"
        String msgTrnA = msgTrn.substring(0,(msgTrn.length()/2)); //first substring
        System.out.println(msgTrnA);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
		
        String msgTrnB = msgTrn.substring((msgTrn.length()/2), msgTrn.length() ); //second substring
        
        System.out.println(msgTrnB);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
        
        String msgTrnAl = msgTrnA.toLowerCase(); //*
        String msgTrnBl = msgTrnB.toLowerCase(); //*
        
        System.out.println(msgTrnAl);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
        System.out.println(msgTrnBl);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
        
        
        //replacing the vowels in each substring
        String aa = msgTrnAl.replace('a','5');
       		   aa = aa.replace('e','4');
       		   aa = aa.replace('i','3');
       		   aa = aa.replace('o','2');
       		   aa = aa.replace('u','1');
        
        System.out.println(aa); //*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
        
        
        //replacing part B vowels
        String bb = msgTrnBl.replace('a','5');
        	   bb = bb.replace('e','4');
        	   bb = bb.replace('i','3');
        	   bb = bb.replace('o','2');
        	   bb = bb.replace('u','1');

        System.out.println(bb);//*
        System.out.println ("");
		System.out.println ("***************");
		System.out.println ("");
		
		
        int i;
        String new_aa = new String ();;
        

        	for (i = 0; i < aa.length(); i++) {
        		 
        		if (i == 0) {
        			char temp = aa.charAt(i);
        			new_aa (i) = aa.replace(aa.charAt(i), temp);
        			
        			
        		}
        		//elements on even indices swapped with element on preceding indices
        		else if(i % 2 == 0) {
        			char temp = aa.charAt(i-1);
        			new_aa (i) = aa.replace(aa.charAt(i), temp);
        			
        	
        			
        		}
        		else {
        			char temp = aa.charAt(i);
        			new_aa (i) = aa.replace(aa.charAt(i), temp);
        			
        		}
        		System.out.print(new_aa + "\n");
        		// aa = aa + new_aa;
        		//System.out.print(aa);
        	}//next i
        	
        	// can not use replace method as character is not stored in a location like that on an array
        
        
        
        
        	
        
        
        
        
       
    }
}
