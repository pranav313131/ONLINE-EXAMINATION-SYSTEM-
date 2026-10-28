class OnlineExam implements Runnable {
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
public class ExamRunnable {
public static void main(String[] args) {
OnlineExam exam = new OnlineExam("Muhamad");
Thread t = new Thread(exam);
t.start();
}
}
