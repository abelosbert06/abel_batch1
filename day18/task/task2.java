import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File source = new File("source.txt");
        File dest = new File("backup/destination.txt");

        dest.getParentFile().mkdirs();

        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully to: " + dest.getPath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}