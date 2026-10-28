import java.util.Scanner; 
class OnlineStudent{ 
 String name; 
 int score = 0; 
 OnlineStudent(String n) { 
 name = n; 
 } 
 void startExam() { 
 Scanner sc = new Scanner(System.in); 
 int ans; 
 System.out.println("\nOnline Examination"); 
 System.out.println("Student Name: " + name); 
 System.out.println("\n1. Java is a?"); 
 System.out.println("1. Programming Language"); 
 System.out.println("2. Operating System"); 
 System.out.println("3. Browser"); 
 System.out.print("Enter Answer: "); 
 ans = sc.nextInt(); 
 if (ans == 1) 
 score++; 
 System.out.println("\n2. Which keyword is used to create an object?"); 
 System.out.println("1. class"); 
 System.out.println("2. new"); 
 System.out.println("3. this"); 
 System.out.print("Enter Answer: "); 
 ans = sc.nextInt(); 
 if (ans == 2) 
 score++; 
 System.out.println("\n3. Constructor name should be?"); 
 System.out.println("1. Same as Class Name"); 
 System.out.println("2. Any Name"); 
 System.out.println("3. Main"); 
 System.out.print("Enter Answer: "); 
 ans = sc.nextInt(); 
 if (ans == 1) 
 score++; 
 System.out.println("\nExam Completed!"); 
 System.out.println("Student: " + name); 
 System.out.println("Score: " + score + "/3"); 
 } 
} 
public class OnlineExam { 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter Student Name: "); 
 String name = sc.nextLine(); 
 OnlineStudent obj = new OnlineStudent(name); 
 obj.startExam(); 
 } 
}
