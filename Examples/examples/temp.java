import java.util.*;

public class temp {
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in);
         
        //creating the array
		System.out.println("Enter the numbers of weeks and days");
		int rowNo = input.nextInt();int colNo = input.nextInt();
		float [][] Temp = new float[rowNo][colNo]; 
		
		//filling the array with data
		for (int i = 0; i < Temp.length; i++) {
			for (int j = 0; j < Temp[i].length; j++) {
				System.out.println ("Enter data into week " + (i+1) + " day " + (j+1)) ;
				Temp[i][j] = input.nextFloat();
				
			}
			//System.out.println("The length of the array row is " + Temp[i].length); Temp[i].length is the number of columns
			//System.out.println("The length of the array is " + Temp.length); Temp.length is the number of rows
    	}
    	//printing the Original data
		System.out.println ("Printing the Original data...\n");

		for (int i = 0; i < Temp.length; i++) {
			for (int j = 0; j < Temp[i].length; j++) {
			System.out.print(Temp[i][j] + "\t");
			}
		System.out.println();
		}
		System.out.println("\n");
		
		//Determine the Maximum
		double maxi = Temp[0][0]; //Temp[0][0] is making sure the variable maxi only accepts 1 value
		for (int i = 0; i < Temp.length; i++) {
			for (int j = 0; j < Temp[i].length;j++) {
			if (Temp[i][j] > maxi) {
				maxi = Temp [i][j];
				}//end if
			}//next column
		}//next row
		
		//Determine when maximum occurs
		for (int i = 0; i < Temp.length; i++) {
			for (int j = 0; j < Temp[i].length; j++) {
				if (Temp[i][j] == maxi) {
					
			String wk = "";
			
			switch (i) {
			case 0:wk = "Week 1"; break;
			case 1:wk = "Week 2"; break;
			case 2:wk = "Week 3"; break;
			case 3:wk = "Week 4"; break;
			} //end switch weeks
	
		String day = "";

		switch (j) {
			case 0:day = "Monday"; break;
			case 1:day = "Tuesday"; break;
			case 2:day = "Wednesay"; break;
			case 3:day = "Thursday"; break;
			case 4:day = "Friday"; break;
			case 5:day = "Saturday"; break;
			case 6:day = "Sunday"; break;
			}
		System.out.println("Maximum Temperature occurs on " + day + "\t" + wk);
				}//end if
			}//next column
		}//next row
		
    }
}
