package Advance;

public class Employee implements Comparable {

  long id;
  String name;
  int age;

  public Employee(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public int compareTo(Object o) {
    Employee e = (Employee) o;
    if (this.getId() == e.getId()) {
      return 0;
    } else if (this.getId() > e.getId()) {
      return 1;
    } else {
      return -1;
    }
  }

}
