import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("conf.dat");
        File newFile = new File("student_data.dat");

        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully to: " + newFile.getName());
            } else {
                System.out.println("Rename failed.");
            }
        } else {
            System.out.println("Source file does not exist.");
        }
    }
}