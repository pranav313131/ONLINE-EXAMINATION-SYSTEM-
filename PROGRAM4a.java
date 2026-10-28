class Exam { 
 String examId; 
 String subject; 
 int totalMarks; 
 int passingMarks; 
 String examinerName; 
 public Exam(String examId, String subject, int totalMarks, int passingMarks, String 
examinerName) { 
 this.examId = examId; 
 this.subject = subject; 
 this.totalMarks = totalMarks; 
 this.passingMarks = passingMarks; 
 this.examinerName = examinerName; 
 } 
 public void displayExamRules() { 
 System.out.println("--- EXAM RULES ---"); 
 System.out.println("1. No calculators allowed."); 
 System.out.println("2. Total Marks: " + totalMarks + " (Passing: " + passingMarks + ")"); 
 System.out.println("3. Examiner: " + examinerName); 
 } 
 public void checkResult(int studentScore) { 
 System.out.println("\n--- RESULT CALCULATION ---"); 
 System.out.println("Student Score: " + studentScore + "/" + totalMarks); 
 if (studentScore >= passingMarks) { 
 System.out.println("Result: PASS - Congratulations!"); 
 } else { 
 System.out.println("Result: FAIL - Better luck next time."); 
 } 
 } 
} 
class OnlineExam extends Exam { 
 String platformName; 
 boolean requiresWebcam; 
 int timeLimitMinutes; 
 public OnlineExam(String examId, String subject, int totalMarks, int passingMarks, String 
examinerName, 
 String platformName, boolean requiresWebcam, int timeLimitMinutes) { 
 super(examId, subject, totalMarks, passingMarks, examinerName); 
 this.platformName = platformName; 
 this.requiresWebcam = requiresWebcam; 
 this.timeLimitMinutes = timeLimitMinutes; 
 } 
 public void runSystemCheck() { 
 System.out.println("\n--- ONLINE SYSTEM CHECK ---"); 
 System.out.println("Connecting to: " + platformName); 
 if (requiresWebcam) { 
 System.out.println("Webcam Status: Connected and active."); 
 } 
 System.out.println("Browser Lock: ENABLED."); 
 System.out.println("Timer Set: " + timeLimitMinutes + " minutes."); 
 } 
 public void startExam() { 
 System.out.println("\n========================================"); 
 System.out.println("STARTING ONLINE EXAM: " + subject + " (" + examId + ")"); 
 System.out.println("========================================"); 
 displayExamRules(); 
 runSystemCheck(); 
 System.out.println("\n[ Exam is now live. Students may begin. ]\n"); 
 } 
} 
public class AdvancedSingleInheritance { 
 public static void main(String[] args) { 
 
 OnlineExam finalExam = new OnlineExam( 
 "CS101", "Data Structures", 100, 40, "Dr. Alan Turing", 
 "ProctorU", true, 120); 
 finalExam.startExam(); 
 finalExam.checkResult(75); 
 } 
}
