import java.io.File;
import java.util.Arrays;

/**
 * Given an array of File objects, sort it so that the directories come before the
 * files, and within each group, elements are sorted by path name. Use a lambda
 * expression, not a Comparator.
 */

public class SortFilesDirectories {

    public static void main(String[] args) {
        File directoryPath = new File("C:\\Users\\srusu");

        File[] filesFromDirectories = getFilesFromDirectories(directoryPath);
        File[] directories = getDirectories(directoryPath);

        Arrays.sort(directories, (directory1, directory2) -> directory1.getName().toLowerCase().compareTo(directory2.getName()));
        Arrays.sort(filesFromDirectories, (files1, files2) -> files1.getName().toLowerCase().compareTo(files2.getName()));

        System.out.println("Directories (using lambda):" + Arrays.toString(directories));
        System.out.println("Files (using lambda):" + Arrays.toString(filesFromDirectories));

    }

    private static File[] getFilesFromDirectories(File directoryPath) {
        // Filter out only files
        return directoryPath.listFiles(File::isFile);
    }

    private static File[] getDirectories(File directoryPath) {
        // Filter out only directories
        return directoryPath.listFiles(File::isDirectory);
    }

}
