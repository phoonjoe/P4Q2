
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Missing One
 */
public class Student {

    private String studentID;
    private String name;
    private int quizzesTaken;
    private int totalScore;

    public Student() {

    }

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuizzesTaken() {
        return quizzesTaken;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void addQuiz(int score) {
        Scanner scan = new Scanner(System.in);
        while (score < 0 || score > 10) {
            System.out.println("Invalid score!(Max 10)");
            System.out.println("Enter score: ");
            score = scan.nextInt();
        }
        totalScore += score;
        quizzesTaken++;

    }

    public double getAverageScore() {
        double avg = (double) totalScore / quizzesTaken;
        return avg;
    }

}
