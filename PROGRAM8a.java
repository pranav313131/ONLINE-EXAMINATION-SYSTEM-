class OnlineExam extends Thread {
String studentName;
OnlineExam(String studentName) {
this.studentName = studentName;
}
public void run() {
System.out.println(studentName + " started the online examination.");
for (int i = 1; i <= 5; i++) {
System.out.println(studentName + " is answering Question " + i);
}
System.out.println(studentName + " completed the examination.");
}
}
public class ExamThread {
public static void main(String[] args) {
OnlineExam exam = new OnlineExam("Muhamad");
exam.start();
}
}
