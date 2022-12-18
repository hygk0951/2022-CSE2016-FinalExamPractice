import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C2_Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader infile = new BufferedReader(new FileReader("test"));
        while (infile.ready()) {
            System.out.println(infile.readLine());
        }
        infile.close();
    }
}
