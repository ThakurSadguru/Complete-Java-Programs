package Advance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Compare {

  public static void main(String[] args) {

    Employee e1 = new Employee(5, "sachit", 25);
    Employee e2 = new Employee(2, "ram", 28);
    Employee e3 = new Employee(3, "luv", 20);

    System.out.println(e2.compareTo(e1));

    List<Employee> employee = new ArrayList<>();
    employee.add(e1);
    employee.add(e2);
    employee.add(e3);

    Collections.sort(employee);

    // Collections.sort(employee, (a,b) -> { this compartor mehod --- 2nd method
    // if (a.getId() == b.getId()) {
    // return 0;
    // } else if (a.getId() > b.getId()) {
    // return 1;
    // } else {
    // return -1;
    // }
    // });

    print(employee);

  }

  public static void print(List<Employee> employeeList) {
    for (Employee employee : employeeList) {
      System.out.println("ID :" + employee.getId() + " Name: " + employee.getName() + " Age: " + employee.getAge());
    }
  }

}
