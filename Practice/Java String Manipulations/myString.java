public class myString {
    public static void main (String[] args) {
        String name = "I am a man";
        System.out.println("Given the string:" + name + "\n");
        int indexOfa = name.indexOf('a');
        System.out.println("First a is found at index " + indexOfa);
        int LastInd = name.lastIndexOf('a');
        System.out.println("Last a is found at index "+ LastInd);
        int indexOfA = name.indexOf('A');
        System.out.println("Capital A is found at index " + indexOfA);
        // Getting next a, add 1 to the first index
        int nextA = indexOfA + 1;
        int nexta = name.indexOf('a', nextA);
        System.out.println("Next a is found at index " + nexta);
        
        // To get all 'a' positions in the string
        // Convert the string to character array
        char[] myCharArray = name.toCharArray();
        // Use for loop to loop round the array to locate where 'a' is found
        for (int i=0; i < myCharArray.length; i++) {
            if (myCharArray[i] == 'a')
                System.out.println("'a' is found at" + i);
        }

        // Substrings
        String part = name.substring(4,8);
        System.out.println("My substring is " + part);

        String noPart = name.substring(4,4);
        System.out.println("My substring is " + noPart);

        String anotherPart = name.substring(8,4);
        System.out.println("My substring is " + anotherPart);
    }
}