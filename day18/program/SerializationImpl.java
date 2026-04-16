import java.io.*;

public class SerializationImpl {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(100, "dante");
            
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("conf.dat"));
            oos.writeObject(s1);
            oos.close();
            
            System.out.println("Object serialized using shared Student class.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}