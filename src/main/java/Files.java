import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/** Using the list(FilenameFilter) method of the java.io.File class, write a method
    that returns all files in a given directory with a given extension. Use a lambda
    expression, not a FilenameFilter. Which variables from the enclosing scope does
    it capture?*/

public class Files {
    public static void main(String[] args) {
        String pathToDirectory = "C:\\Users\\srusu";
        File directory = new File(pathToDirectory);
        String extension = "exe";

        System.out.println("List of files (using lambda):" + Arrays.toString(getFilesFromSubdirectories(directory, extension)));
    }

    public static String[] getFilesFromSubdirectories(File directory, String extension) {
        FilenameFilter filter = ((dir, name) -> name.endsWith("."+ extension));
        return directory.list(filter);
    }

}
