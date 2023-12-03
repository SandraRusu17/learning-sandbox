import java.io.File;
import java.util.Arrays;

/**
 * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class,
 * write a method that returns all subdirectories of a given directory. Use a
 * lambda expression instead of a FileFilter object. Repeat with a method
 * expression.
 */

public class Subdirectories {

    // Method using lambda expression
    private static File[] getSubdirectoriesLambda(File directoryPath) {
        return directoryPath.listFiles(file -> file.isDirectory());
    }

    // Method using method reference
    private static File[] getSubdirectoriesMethodReference(File directoryPath) {
        return directoryPath.listFiles(File::isDirectory);
    }

    public static void main(String[] args) {
        String pathToDirectory = "C:\\Users";
        File directoryPath = new File(pathToDirectory);
        
        File[] subdirectoriesLambda = getSubdirectoriesLambda(directoryPath);
        File[] subdirectoriesMethodReference = getSubdirectoriesMethodReference(directoryPath);

        System.out.println("Subdirectories (Lambda)" + Arrays.toString(subdirectoriesLambda));
        System.out.println("Subdirectories (Method reference)" + Arrays.toString(subdirectoriesMethodReference));

    }
}
