package Assignment;
import java.util.Scanner;

public class Ahmed {
    public static void main(String[] args) {

        String name,jop;
        int age;
        Scanner person = new Scanner(System.in);
        do {
            System.out.println("enter the jop : ");
            jop = person.nextLine();
        }
        while ( !(jop.equals("Eng"))  && ! (jop .equals("Doc"))   && ! (jop .equals("Teacher")) );

        do {
            System.out.println("Enter the age : ");
            age= person.nextInt();
        }
        while (age < 18);

        do {
            System.out.println("Enter the name : ");
            name=person.next();
        }
        while (name.equals("  "));

        if(jop.equals("Teacher")) {
            System.out.println(name + " is old");
        }
        else if (jop.equals("Eng")) {
            System.out.println(name + " is Number 1");
        }
        else if (jop.equals("Doc")) {
            System.out.println("mnwr ya " + name);
        }
        else
            System.out.println(name);
    }
}
