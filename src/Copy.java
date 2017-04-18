import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Copy {
  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination

    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    } else if (args[0].equals("copy") && args.length == 1) {
      System.out.println("No destination provided");
    } else if (args[0].equals("copy") && args[1].equals("source.txt") && args[2].equals("destination.txt")) {
      Path source = Paths.get(args[1]);
      Path destination = Paths.get(args[2]);
      try {
        List<String> lines = new ArrayList<>(Files.readAllLines(source));
        for (String line : lines) {
         byte[] buf = line.getBytes();
         Files.write(destination, buf);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}