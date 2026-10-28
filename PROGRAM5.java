import java.util.Scanner; 
public class OnlineExamination { 
 static class Exam { 
 String studentName; 
 Exam(String studentName) { 
 this.studentName = studentName; 
 } 
 void startExam() { 
 System.out.println("Exam Started"); 
 } 
 } 
 static class OnlineExamSystem extends Exam { 
 Scanner sc; 
 OnlineExamSystem(String studentName, Scanner sc) { 
 super(studentName); 
 this.sc = sc; 
 } 
 @Override 
 void startExam() { 
 int score = 0; 
 System.out.println("\n===== ONLINE EXAMINATION SYSTEM ====="); 
 System.out.println("Student Name : " + studentName); 
 System.out.println("Exam Started!\n"); 
 System.out.println("1. Which language is used for Android development?"); 
 System.out.println("1. Java"); 
 System.out.println("2. HTML"); 
 System.out.println("3. SQL"); 
 System.out.println("4. CSS"); 
 System.out.print("Enter your answer: "); 
 int answer1 = sc.nextInt(); 
 if (answer1 == 1) { 
 score++; 
 } 
 System.out.println("\n2. Which keyword is used for inheritance in Java?"); 
 System.out.println("1. implement"); 
 System.out.println("2. extends"); 
 System.out.println("3. inherit"); 
 System.out.println("4. super"); 
 System.out.print("Enter your answer: "); 
 int answer2 = sc.nextInt(); 
 if (answer2 == 2) { 
 score++; 
 } 
 System.out.println("\n3. Which method is the starting point of a Java program?"); 
 System.out.println("1. start()"); 
 System.out.println("2. run()"); 
 System.out.println("3. main()"); 
 System.out.println("4. execute()"); 
 System.out.print("Enter your answer: "); 
 int answer3 = sc.nextInt(); 
 if (answer3 == 3) { 
 score++; 
 } 
 System.out.println("\n===== EXAM RESULT ====="); 
 System.out.println("Student Name : " + studentName); 
 System.out.println("Score : " + score + "/3"); 
 if (score >= 2) { 
 System.out.println("Result : PASS"); 
 } else { 
 System.out.println("Result : FAIL"); 
 } 
 } 
 } 
 public static void main(String[] args) { 
 try (Scanner sc = new Scanner(System.in)) { 
 System.out.print("Enter Student Name: "); 
 String name = sc.nextLine(); 
 Exam exam = new OnlineExamSystem(name, sc); 
 exam.startExam(); 
 } 
 }
