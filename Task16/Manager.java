package Task16;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
class Manager implements Employee {
 private String name;
 private List<Employee> team = new ArrayList<>();
 public Manager(String name) {
 this.name = name;
 }
 public void add(Employee e) {
 team.add(e);
 }
 public void showDetails() {
 System.out.println("Manager: " + name);
 for (Employee e : team) {
 e.showDetails();
 }
 }
}
