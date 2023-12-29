public class TextAppending {
    public static void main (String[] args) {
        StringBuffer buf = new StringBuffer(10);
        buf.append("It was");
        System.out.println("Initial string is:" + buf);
        buf.append("the best");
        System.out.println("Final string is:" + buf); 
    }
}