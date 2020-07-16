/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Missing One
 */
public class TestStudent {
    public static void main(String []args){
        Student s1=new Student("123","Ali");
        Student s2=new Student();
        
        s2.setName("Yolo");
        s2.setStudentID("456");
        
        s1.addQuiz(9);
        s2.addQuiz(10);
        
        Student.setContribution(20);
        
        System.out.printf("%-15s %-3d %-3d %-5.2f %-5.2f\n",s1.getName(),s1.getQuizzesTaken(),s1.getTotalScore(),s1.getAverageScore(),s1.getAverageScore()/10*Student.getContribution());
    }
}
