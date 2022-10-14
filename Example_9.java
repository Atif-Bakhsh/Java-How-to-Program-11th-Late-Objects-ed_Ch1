// A program to get the path of the file path of the directory.
import java.nio.file.Path;

public class Example_9 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println("Working Directory = " + path);    
    }
}
