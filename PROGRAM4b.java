class Question { 
 int questionId; 
 String text; 
 int marks; 
 String difficulty; 
 public Question(int questionId, String text, int marks, String difficulty) { 
 this.questionId = questionId; 
 this.text = text; 
 this.marks = marks; 
 this.difficulty = difficulty; 
 } 
 public void displayQuestionHeader() { 
 System.out.println("Q" + questionId + ". [" + difficulty + "] " + text + " (" + marks + " 
Marks)"); 
 } 
} 
class MCQ extends Question { 
 String[] options; 
 int correctOption; 
 public MCQ(int id, String text, int marks, String diff, String[] options, int correctOption) { 
 super(id, text, marks, diff); 
 this.options = options; 
 this.correctOption = correctOption; 
 } 
 public void display() { 
 displayQuestionHeader(); 
 for (int i = 0; i < options.length; i++) { 
 System.out.println(" " + (i + 1) + ") " + options[i]); 
 } 
 } 
} 
class TrueFalse extends Question { 
 boolean correctAnswer; 
 public TrueFalse(int id, String text, int marks, String diff, boolean correctAnswer) { 
 super(id, text, marks, diff); 
 this.correctAnswer = correctAnswer; 
 } 
 public void display() { 
 displayQuestionHeader(); 
 System.out.println(" 1) True"); 
 System.out.println(" 2) False"); 
 } 
} 
class CodingQuestion extends Question { 
 String programmingLanguage; 
 String testCaseInput; 
 String testCaseOutput; 
 public CodingQuestion(int id, String text, int marks, String diff, String lang, String in, String out) 
{ 
 super(id, text, marks, diff); 
 this.programmingLanguage = lang; 
 this.testCaseInput = in; 
 this.testCaseOutput = out; 
 } 
 public void display() { 
 displayQuestionHeader(); 
 System.out.println(" [Language Required: " + programmingLanguage + "]"); 
 System.out.println(" Sample Input: " + testCaseInput); 
 System.out.println(" Expected Output: " + testCaseOutput); 
 } 
} 
public class AdvancedHierarchicalInheritance { 
 public static void main(String[] args) { 
 System.out.println("=========================================="); 
 System.out.println(" COMPUTER SCIENCE EXAM "); 
 System.out.println("==========================================\n"); 
 
 String[] q1Options = {"O(1)", "O(n)", "O(n^2)", "O(log n)"}; 
 MCQ q1 = new MCQ( 
 1, "What is the time complexity of Binary Search?", 5, "Medium", q1Options, 4 
 ); 
 TrueFalse q2 = new TrueFalse( 
 2, "In Java, a class can extend multiple classes simultaneously.", 2, "Easy", false 
 ); 
 CodingQuestion q3 = new CodingQuestion( 
 3, "Write a function to reverse a string.", 15, "Hard", "Java", "\"hello\"", "\"olleh\"" 
 ); 
 q1.display(); 
 System.out.println(); 
 q2.display(); 
 System.out.println(); 
 
 q3.display(); 
 System.out.println("\n=========================================="); 
 System.out.println(" END OF QUESTION PAPER "); 
 System.out.println("=========================================="); 
 } 
}
