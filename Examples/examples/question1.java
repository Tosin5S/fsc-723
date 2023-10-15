import java.util.*;

public class question1 {
	
	static double nsq (int n) {
		return  Math.pow(n,2);
	}//class of Nsq
	
	static double nsqroot (int n) {
		return  Math.sqrt(n);
	}//class of NsqRoot
	
	static double ncb (int n) {
		return  Math.pow(n,3);
	}//class of NCube
	
	static double ncbroot (int n) {
		return  Math.cbrt(n);
	}//class of NCubeRoot
        
    
    public static void main(String[] args) {
    	System.out.format("%-15s%-15s%-15s%-15s%-15s\n", "N", "NSq", "NSqRoot", "NCube", "NCubeRoot");
    	//System.out.println ("N \t  NSq \t NSqRoot \t NCube \t NCubeRoot");
        for (int n = 1; n <= 5; n++) {
        	//%d%f in line with printf as java rules suggests
        	//%d formats decimal integer & %f formats floating point (decimal number) with %8.2f meaning eight digits and two decimal points
        	
        System.out.format ("%-15s%-15s%-15s%-15s%-15s\n", n, nsq(n), nsqroot(n), ncb(n), ncbroot(n));
        	//System.out.printf ("%d %8.2f %8.2f %8.2f %8.2f \n", n, nsq(n), nsqroot(n), ncb(n), ncbroot(n));
        	
        	//System.out.println (n + "\t" + nsq(n) +"\t"+ nsqroot(n)+"\t"+ ncb(n) + "\t" + ncbroot(n));
        }
    }
}
