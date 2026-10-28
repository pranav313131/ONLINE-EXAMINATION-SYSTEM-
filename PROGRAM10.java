class OnlineExam {
private final Object examLock = new Object();
private final Object resultLock = new Object();
public void conductExam(String student) {
synchronized (examLock) {
System.out.println(student + " started the examination.");
synchronized (resultLock) {
System.out.println(student + " is submitting the answers.");
System.out.println(student + " result is being processed.");
}
System.out.println(student + " completed the examination.");
}
}
}
class Student extends Thread {
private OnlineExam exam;
private String studentName;
Student(OnlineExam exam, String studentName) {
this.exam = exam;
this.studentName = studentName;
}
public void run() {
exam.conductExam(studentName);
}
}
public class OnlineExaminationSystem {
public static void main(String[] args) {
OnlineExam exam = new OnlineExam();
Student s1 = new Student(exam, "Student 1");
Student s2 = new Student(exam, "Student 2");
Student s3 = new Student(exam, "Student 3");
s1.start();
s2.start();
s3.start();
}
}
