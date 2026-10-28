class Student {
 int studentId;
 String name;
 String subject;
 Student(int studentId, String name, String subject) {
 this.studentId = studentId;
 this.name = name;
 this.subject = subject;
 }
 void display() {
 System.out.println("Student ID : " + studentId);
 System.out.println("Name : " + name);
 System.out.println("Subject : " + subject);
 }
}
public class Exp1 {
 public static void main(String[] args) {
 Student s1 = new Student(119, "PRANAV", "Java");
 s1.display();
 }
}
