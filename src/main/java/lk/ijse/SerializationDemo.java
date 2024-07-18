package lk.ijse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.address = "Galle";
        student.name = "Charmie Weerapperuma";
        student.NIC = 1234568909;
        student.number = 123;

        try {
            //Create an object from FileOutputStream and giving serializable type file name
            FileOutputStream fileOutput = new FileOutputStream("student.ser");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

            //Passing the object that we want to write
            objectOutput.writeObject(student);

            //Closing the FileOutputStream & ObjectOutputStream
            objectOutput.close();
            fileOutput.close();

            System.out.println("Serialized data is saved in student.ser file..!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

