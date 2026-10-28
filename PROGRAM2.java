class ExamStudent { 
 String name; 
 int regNo; 
 static int totalStudents = 0; 
 ExamStudent(String name, int regNo) { 
 this.name = name; 
 this.regNo = regNo; 
 totalStudents++; 
 } 
 public void display() { 
 System.out.println("Student Name : " + name); 
 System.out.println("Register No : " + regNo); 
 } 
 public void display(int score) { 
 display(); 
 System.out.println("Score : " + score + "/3"); 
 } 
 public void startExam() { 
 int score = 0; 
 char ans1 = 'A'; 
 char ans2 = 'B'; 
 char ans3 = 'A'; 
 if (ans1 == 'A') 
 score++; 
 if (ans2 == 'B') 
 score++; 
 if (ans3 == 'A') 
 score++; 
 System.out.println("===== ONLINE EXAM RESULT ====="); 
 display(score); 
 System.out.println("Total Students: " + totalStudents); 
 } 
} 
public class OnlineExaminationSystem { 
 public static void main(String[] args) { 
 ExamStudent s1 = new ExamStudent("PRANAV", 119); 
 s1.startExam(); 
 } 
}
