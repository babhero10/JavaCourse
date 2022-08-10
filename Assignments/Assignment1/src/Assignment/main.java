package Assignment;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        String name;
        int age;
        String job;

        do {
            name = JOptionPane.showInputDialog(null, "Enter your name");
        } while (name == null || name.length() == 0);

        do {
            age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
        } while (age < 18);

        boolean state;
        do {
            state = true;
            job = JOptionPane.showInputDialog(null, "Enter your Job");
            if (job == null || job.length() == 0) {
                state = false;
                continue;
            }
            if (job.compareTo("Eng") == 0) {
                JOptionPane.showMessageDialog(null, name + " Number one!");
            } else if (job.compareTo("Doc") == 0) {
                JOptionPane.showMessageDialog(null, name + " You are old!");
            } else if (job.compareTo("Teacher") == 0) {
                JOptionPane.showMessageDialog(null, name + " Mnwr!");
            } else {
                state = false;
            }
        } while (!state);
    }
}
