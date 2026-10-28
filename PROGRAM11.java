class Main {
static class Examination {
private int submittedCount = 0;
public synchronized void submitExam(String student, int marks) {
submittedCount++;
System.out.println(student + " submitted the exam.");
System.out.println("Marks obtained: " + marks);
System.out.println("Submission number: " + submittedCount);
System.out.println();
}
public synchronized void displayResult() {
System.out.println("Total students submitted: " + submittedCount);
}
}
static class Student extends Thread {
private Examination exam;
private int marks;
Student(String name, Examination exam, int marks) {
super(name);
this.exam = exam;
this.marks = marks;
}
public void run() {
try {
System.out.println(getName() + " started the examination.");
Thread.sleep(500);
exam.submitExam(getName(), marks);
} catch (InterruptedException e) {
System.out.println(getName() + " was interrupted.");
Thread.currentThread().interrupt();
}
}
}
public static void main(String[] args) throws InterruptedException {
Examination exam = new Examination();
Student s1 = new Student("Student A", exam, 85);
Student s2 = new Student("Student B", exam, 90);
Student s3 = new Student("Student C", exam, 78);
System.out.println("S1 State: " + s1.getState());
System.out.println("S2 State: " + s2.getState());
System.out.println("S3 State: " + s3.getState());
s1.start();
s2.start();
s3.start();
s1.join();
s2.join();
s3.join();
System.out.println("\nS1 State: " + s1.getState());
System.out.println("S2 State: " + s2.getState());
System.out.println("S3 State: " + s3.getState());
System.out.println("\n--- EXAMINATION SUMMARY ---");
exam.displayResult();
System.out.println("Examination completed successfully.");
}
}
