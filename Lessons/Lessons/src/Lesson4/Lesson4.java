package Lesson4;

import javax.swing.JOptionPane;

public class Lesson4 {
    public static void main(String[] args) {
        /*
        String a;
        a = JOptionPane.showInputDialog(null, "Enter you grade");

        switch (a) {
            case "a":
            case "A":
                JOptionPane.showMessageDialog(null, "4");
                break;
            case "b":
            case "B":
                JOptionPane.showMessageDialog(null, "3");
                break;
            case "c":
            case "C":
                JOptionPane.showMessageDialog(null, "2");
                break;
            case "d":
            case "D":
                JOptionPane.showMessageDialog(null, "1");
                break;
            case "f":
            case "F":
                JOptionPane.showMessageDialog(null, "3ala elsummer ya nerm");
                break;
            default:
                JOptionPane.showMessageDialog(null, "2da ya 8aly");
        }
        */

        int grade;
        grade = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter you grade"));
        
        if (grade <= 100 && grade >= 90) {
            JOptionPane.showMessageDialog(null, "4");
        } else if (grade < 90 && grade > 80) {
            JOptionPane.showMessageDialog(null, "3");
        } else if (grade < 90 && grade >= 80) {
            JOptionPane.showMessageDialog(null, "2.5");
        } else if (grade < 80 && grade >= 70) {
            JOptionPane.showMessageDialog(null, "2");
        } else if (grade < 70 && grade >= 60) {
            JOptionPane.showMessageDialog(null, "1");
        } else if (grade < 60 && grade >= 0) {
            JOptionPane.showMessageDialog(null, "3ala elsummer ya nerm");
        } else {
            JOptionPane.showMessageDialog(null, "2da ya 8aly");
        }
    }
}
