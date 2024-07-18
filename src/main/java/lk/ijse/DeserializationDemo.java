package lk.ijse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        //Creating a variable for assign the deserialized object
        Student student = null;

        try {
            //Create an object from FileInputStream to insert serializable file that we want to read
            FileInputStream fileInput = new FileInputStream("student.ser");
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            //Casting the object of ObjectInputStream to Student type and assigning to Student variable
            student = (Student) objectInput.readObject();

            //Closing the FileInputStream & ObjectInputStream
            objectInput.close();
            fileInput.close();

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Student class not found..!!");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserializing the Student..");
        System.out.println("Name : " + student.name);
        System.out.println("Address : " + student.address);
        System.out.println("NIC : " + student.NIC);
        System.out.println("Number : " + student.number);
    }
}

