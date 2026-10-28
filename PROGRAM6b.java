import java.util.Scanner; 
interface StudentOperations { 
 void enterStudentDetails(); 
 void displayStudentDetails(); 
} 
interface ExamOperations { 
 void startExam(); 
 void calculateResult(); 
} 
// Multiple inheritance using two interfaces 
class OnlineExam implements StudentOperations, ExamOperations { 
 String studentName; 
 int rollNo; 
 int score = 0; 
 Scanner sc = new Scanner(System.in); 
 public void enterStudentDetails() { 
 System.out.print("Enter Student Name: "); 
 studentName = sc.nextLine(); 
 System.out.print("Enter Roll Number: "); 
 rollNo = sc.nextInt(); 
 } 
 public void displayStudentDetails() { 
 System.out.println("\n===== STUDENT DETAILS ====="); 
 System.out.println("Student Name : " + studentName); 
 System.out.println("Roll Number : " + rollNo); 
 } 
 public void startExam() { 
 String[] questions = { 
 "1. Which keyword is used to inherit a class in Java?\n" 
 + "A. implements\nB. extends\nC. inherit\nD. super", 
 "2. Which concept is achieved using interfaces?\n" 
 + "A. Multiple Inheritance\nB. Compilation\nC. Exception\nD. Package", 
 "3. Which method is the starting point of a Java program?\n" 
 + "A. start()\nB. run()\nC. main()\nD. execute()" 
 }; 
 char[] answers = {'B', 'A', 'C'}; 
 System.out.println("\n===== ONLINE EXAM STARTED ====="); 
 for (int i = 0; i < questions.length; i++) { 
 System.out.println("\n" + questions[i]); 
 System.out.print("Enter your answer: "); 
 char answer = sc.next().toUpperCase().charAt(0); 
 if (answer == answers[i]) { 
 score++; 
 } 
 } 
 } 
 public void calculateResult() { 
 System.out.println("\n===== EXAM RESULT ====="); 
 System.out.println("Student Name : " + studentName); 
 System.out.println("Roll Number : " + rollNo); 
 System.out.println("Total Marks : 3"); 
 System.out.println("Score : " + score); 
 if (score >= 2) { 
 System.out.println("Result : PASS"); 
 } else { 
 System.out.println("Result : FAIL"); 
 } 
 } 
} 
public class OnlineExaminationSystem1 { 
 public static void main(String[] args) { 
 OnlineExam exam = new OnlineExam(); 
 exam.enterStudentDetails(); 
 exam.displayStudentDetails(); 
 exam.startExam(); 
 exam.calculateResult(); 
 }
