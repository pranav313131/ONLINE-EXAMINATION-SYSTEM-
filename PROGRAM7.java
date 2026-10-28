import java.util.Scanner;
class InvalidAnswerException extends Exception {
 public InvalidAnswerException(String message) {
 super(message);
 }
}
class Exam {
 private int score = 0;
 public void checkAnswer(int answer) throws InvalidAnswerException {
 if (answer < 1 || answer > 4) {
 throw new InvalidAnswerException("Invalid option! Choose between 1 and 4.");
 }
 if (answer == 2) {
 score++;
 }
 }
 public int getScore() {
 return score;
 }
}
public class OnlineExaminationSystem {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Exam exam = new Exam();
 String[] questions = {
 "Which language is used for Android development?",
 "Which keyword is used to inherit a class in Java?",
 "Which method starts a Java program?",
 "Which concept provides data hiding?"
 };
 String[][] options = {
 {"Python", "Java", "HTML", "SQL"},
 {"implements", "extends", "inherits", "super"},
 {"start()", "run()", "main()", "execute()"},
 {"Inheritance", "Encapsulation", "Polymorphism", "Abstraction"}
 };
 int[] correctAnswers = {2, 2, 3, 2};
 System.out.println("===== ONLINE EXAMINATION SYSTEM =====");
 for (int i = 0; i < questions.length; i++) {
 System.out.println("\nQ" + (i + 1) + ". " + questions[i]);
 for (int j = 0; j < 4; j++) {
 System.out.println((j + 1) + ". " + options[i][j]);
 }
 System.out.print("Enter your answer: ");
 int answer = sc.nextInt();
 try {
 if (answer < 1 || answer > 4) {
 throw new InvalidAnswerException(
 "Invalid answer! Please select an option from 1 to 4."
 );
 }
 if (answer == correctAnswers[i]) {
 exam.checkAnswer(answer);
 System.out.println("Correct answer!");
 } else {
 exam.checkAnswer(answer);
 System.out.println("Wrong answer!");
 }
 } catch (InvalidAnswerException e) {
 System.out.println("Exception: " + e.getMessage());
 i--;
 }
 }
 System.out.println("\n===== EXAM RESULT =====");
 System.out.println("Total Questions : " + questions.length);
 System.out.println("Correct Answers : " + exam.getScore());
 System.out.println("Score : " + exam.getScore() + "/" + questions.length);
 sc.close();
 }
}
