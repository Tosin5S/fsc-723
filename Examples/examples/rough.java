

public class rough {
        
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sum = 0; int i,j = 2;
        for (i = 10; i >= 0; i -= 2); {
        	sum += j%i;
        	j += 3;
        }
        System.out.print ("Total accumulated Sum = " ,sum) ;
    }
}
