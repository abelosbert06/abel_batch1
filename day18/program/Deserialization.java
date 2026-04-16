import java.io.*;

public class Deserialization {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("conf.dat"));
            
            Student s = (Student) ois.readObject();
            
            System.out.println("after deserialization");
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
            
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}