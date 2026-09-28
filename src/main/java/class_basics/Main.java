package class_basics;

import class_basics.model.Employee;

public class Main {
    static void main() {

        Employee employee1 = new Employee();
        employee1.age = 34;
        employee1.name = "Alex";
        employee1.last_name = "Pilaev";

        Employee employee2 = new Employee("Max", "Zukov", 20);
        employee2.printInfo();

        Employee employee3 = new Employee();

        employee1.printInfo();

        System.out.printf("+++++++++++++++++%n");

        employee2.printInfo();

        System.out.printf("Max age of employee: %d%n", Employee.MAX_AGE);

        System.out.printf("Default age of employee: %d%n", Employee.defaultAge);

        Employee.defaultAge = 50;

        System.out.printf("Default age of employee: %d%n", Employee.defaultAge);

    }
}
