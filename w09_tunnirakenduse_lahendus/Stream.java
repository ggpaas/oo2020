import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Stream {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("proccessed_person.txt"));

        Files.readAllLines(Paths.get("person.txt")).stream()
                    .map(e -> e.split(","))
                    .filter(e -> Integer.parseInt(e[0])==2)
                    .map(e -> e[1] + " perekonna nimi on "+e[2])
                    .forEach(pw::println);

        pw.close();
    }
    

}