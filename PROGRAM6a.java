import java.util.Scanner; 
abstract class Examination { 
 String studentName; 
 int rollNo; 
 Examination(String studentName, int rollNo) { 
 this.studentName = studentName; 
 this.rollNo = rollNo; 
 } 
 abstract void startExam(); 
 abstract void calculateResult(); 
 void displayStudentDetails() { 
 System.out.println("\n===== ONLINE EXAMINATION SYSTEM ====="); 
 System.out.println("Student Name : " + studentName); 
 System.out.println("Roll Number : " + rollNo); 
 } 
} 
class OnlineExam extends Examination { 
 int score = 0; 
 OnlineExam(String studentName, int rollNo) { 
 super(studentName, rollNo); 
 } 
 void startExam() { 
 Scanner sc = new Scanner(System.in); 
 String[] questions = { 
 "1. Which language is used for Android development?\nA. Java\nB. HTML\nC. SQL\nD. 
CSS", 
 "2. Which keyword is used to inherit a class in Java?\nA. implements\nB. extends\nC. 
inherit\nD. super", 
 "3. Which concept hides implementation details?\nA. Inheritance\nB. Polymorphism\nC. 
Abstraction\nD. Encapsulation" 
 }; 
 char[] answers = {'A', 'B', 'C'}; 
 System.out.println("\n--- Exam Started ---"); 
 for (int i = 0; i < questions.length; i++) { 
 System.out.println("\n" + questions[i]); 
 System.out.print("Enter your answer: "); 
 char answer = sc.next().toUpperCase().charAt(0); 
 if (answer == answers[i]) { 
 score++; 
 } 
 } 
 calculateResult(); 
 } 
 void calculateResult() { 
 System.out.println("\n===== EXAM RESULT ====="); 
 System.out.println("Student Name : " + studentName); 
 System.out.println("Roll Number : " + rollNo); 
 System.out.println("Score : " + score + "/3"); 
 if (score >= 2) 
 System.out.println("Result : PASS"); 
 else 
 System.out.println("Result : FAIL"); 
 } 
} 
public class OnlineExaminationSystem { 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter Student Name: "); 
 String name = sc.nextLine(); 
 System.out.print("Enter Roll Number: "); 
 int roll = sc.nextInt(); 
 OnlineExam exam = new OnlineExam(name, roll); 
 exam.displayStudentDetails(); 
 exam.startExam(); 
 sc.close(); 
 } 
}
