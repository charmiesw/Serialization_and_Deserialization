package lk.ijse;

import java.io.Serializable;

//We must implement Serializable interface to the Student class for serialize the object of that class.
public class Student implements Serializable {
   public String name;
   public String address;
   public transient int NIC;
   public int number;

   public void mailCheck() {
      System.out.println("Mailing a check to " + name + " " + address);
   }
}