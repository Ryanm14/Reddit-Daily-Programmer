import java.util.Scanner;
import java.util.ArrayList;

/**
 * create a program that will allow you to enter events organizable by hour. 
 * There must be menu options of some form, and you must be able to easily edit, add, and delete events 
 * without directly changing the source code.
 * 
 * @author Ryanm14
 * 
 */
public class Challenge_1_Intermediate {

 static ArrayList < Event > events = new ArrayList < > ();

 public static void main(String[] args) {
  Boolean stop = false;
  Scanner input = new Scanner(System. in );
  String name = "", time = "";
  int choice = 0;
  while (!stop) {
   System.out.println("Enter 0 to display all events, 1 to add an Event, 2 to modify an Event, 3 to delete an Event, or any other number to stop");
   switch (input.nextInt()) {
    case 0:
     System.out.println(displayAllEvents());
     break;
    case 1:
     System.out.println("Enter event name: ");
     input.nextLine(); //Fix grabbing the wrong info
     name = input.nextLine();
     System.out.println("Enter event time: ");
     time = input.nextLine();
     addEvent(name, time);
     break;
    case 2:
     System.out.println(displayAllEvents());
     System.out.println("Enter in the number of event you want to modify");
     choice = input.nextInt();
     System.out.println("Enter 1 to edit name or 2 to edit time");
     if (input.nextInt() == 1) {
      System.out.println("Enter new name: ");
      input.nextLine();
      name = input.nextLine();
      editEventName(choice, name);
     } else {
      System.out.println("Enter new time: ");
      input.nextLine();
      time = input.nextLine();
      editEventTime(choice, time);
     }
     break;
    case 3:
     System.out.println(displayAllEvents());
     System.out.println("Enter in the number of event you want to delete");
     choice = input.nextInt();
     deleteEvent(choice);
     break;
    default:
     stop = true;
   }
  }
 }
 public static void addEvent(String name, String time) {
  Event event = new Event(name, time);
  events.add(event);
 }
 public static String displayAllEvents() {
  String all = "";
  int number = 0;
  for (Event event: events) {
   all += number + "\t" + event + "\n";
   number++;
  }
  return all;
 }

 public static void editEventName(int choice, String name) {
  events.get(choice).setName(name);
 }

 public static void editEventTime(int choice, String time) {
  events.get(choice).setTime(time);
 }

 public static void deleteEvent(int choice) {
  events.remove(choice);
 }

}