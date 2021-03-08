/*
Problem Defintion
Write a GUI application that creates a quiz. 
The quiz should contain at least three questions about a hobby, popular music, astronomy, or any other personal interest. 
Each question should be a multiple-choice question with at least four answer options. 
When the user answers the question correctly, display a congratulatory message. 
If the user responds to a question incorrectly, display an appropriate message as well as the correct answer. 
At the end of the quiz, display the number of correct and incorrect answers, and the percentage of correct answers. 
Save the file as Quiz.java.
Author: Montell N.
Date: 3/5/21
 */
package quiz;

import javax.swing.*;

public class Quiz {

    public static void main(String[] args) {
        int correct = 0;
        int totalAsked = 0;
        double percentCorrect;
        
        //Asking the user questions
        String qs1 = "What is the most popular track in the Doom Eternal Soundtrack?";
        String qs2 = "What is 2020 Game of the Year?";
        String qs3 = "What is Marvel's strongest villan in the MCU?";
        
        //The answers for the questions
        String ans1 = "Cultist Base";
        String ans2 = "The Last of Us Part II";
        String ans3 = "Thanos";
        String aList = "\n1) " + ans1 + " \n2)" + ans2 + " \n3)" + ans3 + " \n4) All of the above";
        
        //GUI Panel
        JOptionPane.showMessageDialog(null, qs1 + aList);
        
        //Inputs for the user's answers
        String input = JOptionPane.showInputDialog("Answer: ");
        int answer = Integer.parseInt(input);
        
        //While loop for question 1
        while(answer < 1 || answer > 4){
            JOptionPane.showMessageDialog(null, "Nope! The answer must be bewtween 1 and 4.");
            input = JOptionPane.showInputDialog("Answer: ");
            answer = Integer.parseInt(input);
            
        }
        ++totalAsked; //If else statements for question 1
        if(answer != 1){
            JOptionPane.showMessageDialog(null, "Wrong! The correct answer is: " + ans1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Good job! That was the right answer.");
            ++correct;
        }
        
        JOptionPane.showMessageDialog(null, qs2 + aList);
        input = JOptionPane.showInputDialog("Answer: ");
        answer = Integer.parseInt(input);
        //While loop for question 2
        while(answer < 1 || answer > 4){
            JOptionPane.showMessageDialog(null, "Nope! The answer must be bewtween 1 and 4.");
            input = JOptionPane.showInputDialog("Answer: ");
            answer = Integer.parseInt(input);
            
        }
        ++totalAsked; //If else statements for question 2
        if(answer != 2){
            JOptionPane.showMessageDialog(null, "Wrong! The correct answer is: " + ans2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Good job! That was the right answer.");
            ++correct;
        }
        
        JOptionPane.showMessageDialog(null, qs3 + aList);
        input = JOptionPane.showInputDialog("Answer: ");
        answer = Integer.parseInt(input);
        //While loop for question 3
        while(answer < 1 || answer > 4){
            JOptionPane.showMessageDialog(null, "Nope! The answer must be bewtween 1 and 4.");
            input = JOptionPane.showInputDialog("Answer: ");
            answer = Integer.parseInt(input);
            
        }
        ++totalAsked; //If else statements for question 3
        if(answer != 3){
            JOptionPane.showMessageDialog(null, "Wrong! The correct answer is: " + ans3);
        }
        else{
            JOptionPane.showMessageDialog(null, "Good job! That was the right answer.");
            ++correct;
        }
        percentCorrect = ((double)correct / totalAsked) * 100;
        JOptionPane.showMessageDialog(null, "You got " + correct + " out of " + totalAsked + " questions right. \nToalt percentage: " 
        + Math.round(percentCorrect));
    }
    
}
