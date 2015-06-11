/* Object class for Challenge 1 Intermediate
 * @author Ryanm14
 * 
 */
public class Event {
 private String name, time;

 public Event(String name, String time) {
  this.name = name;
  this.time = time;
 }

 public String getName() {
  return name;
 }

 public String getTime() {
  return time;
 }

 public void setName(String name) {
  this.name = name;
 }

 public void setTime(String time) {
  this.time = time;
 }

 public String toString() {
  return name + "\t" + time;
 }
}