package java_practical_list1;

import java.io.*;

class Student implements Serializable {
    String name;
    int age;
    Student(String name, int age) { this.name = name; this.age = age; }
}

public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
        oos.writeObject(new Student("Ram", 20));
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
        Student s = (Student) ois.readObject();
        System.out.println("Name: " + s.name + ", Age: " + s.age);
        ois.close();
    }
}
