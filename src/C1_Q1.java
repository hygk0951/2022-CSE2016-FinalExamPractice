import java.io.*;

public class C1_Q1 {
    public static void main(String[] args) throws IOException{
        PrintWriter outfile = new PrintWriter(new FileWriter("test"));
        outfile.println("Hello world!");
        outfile.close();
    }
}
