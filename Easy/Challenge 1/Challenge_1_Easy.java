import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * create a program that will ask the users name, age, and reddit username. 
 * have it tell them the information back, in the format:
 * your name is (blank), you are (blank) years old, and your username is (blank)
 * http://redd.it/pih8x
 * 
 * @author Ryanm14
 */

public class Challenge_1_Easy{
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = input.nextLine();
    System.out.println("Enter your age:");
    int age = input.nextInt();
    System.out.println("Enter your reddit username:");
    input.nextLine(); //Fix nextLine() selecting the wrong info
    String username = input.nextLine();
    System.out.println("your name is " + name + ", you are " + age + " years old, and your username is " + username);
    
    //Export data to .txt file
    PrintStream output = new PrintStream(new File("data.txt"));
    output.print(name + " " + age + " " + username);
  }
}
    
