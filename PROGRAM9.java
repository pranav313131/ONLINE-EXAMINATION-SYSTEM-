class OnlineExam {
private boolean examStarted = false;
synchronized void waitForExam(String student) {
try {
while (!examStarted) {
System.out.println(student + " is waiting for the exam to start.");
wait();
}
System.out.println(student + " started the online examination.");
} catch (InterruptedException e) {
System.out.println(student + " was interrupted.");
}
}
synchronized void startExam() {
System.out.println("\nExam is starting...");
examStarted = true;
notifyAll();
System.out.println("All waiting students have been notified.");
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
exam.waitForExam(studentName);
}
}
class ExamController extends Thread {
private OnlineExam exam;
ExamController(OnlineExam exam) {
this.exam = exam;
}
public void run() {
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
System.out.println("Controller interrupted.");
}
exam.startExam();
}
}
public class OnlineExaminationSystem {
public static void main(String[] args) {
OnlineExam exam = new OnlineExam();
Student s1 = new Student(exam, "Student 1");
Student s2 = new Student(exam, "Student 2");
Student s3 = new Student(exam, "Student 3");
ExamController controller = new ExamController(exam);
s1.start();
s2.start();
s3.start();
controller.start();
}
}
